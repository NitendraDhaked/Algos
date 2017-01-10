
public class StringManipulation {

	//Method for string comparison
	public static boolean compareString(String str1, String str2 )
	{

		String [] splittedArr1 =str1.split(" "); //String first splits into array of string
		String [] splittedArr2 =str2.split(" "); ////String second splits into array of string

		boolean flag=false;  //flag to check strings are equal or not
		if(splittedArr1.length==splittedArr2.length)
		{
			for(int i=0; i<splittedArr1.length;i++) // if both string have same length
			{
				if(!splittedArr1[i].equals(splittedArr2[i]))  //check for all splits
				{
					flag=false;
					break;
				}	
				flag=true;
			}
		}
		else
		{
			flag=false;
		}

		return flag;
	}

	//return the pattern count any string or any pattern case sensitive	
	public static int patternCount(String strp, String pattern)
	{
		char[] arrStr=strp.toCharArray(); //string splits into char array
		char[] arrPattern=pattern.toCharArray(); // pattern splits into char array
		int count = 0;
		for(int i=0; i<arrStr.length ;i++)  //loop for full string
		{
			int l=i; //original string position
			int match=0;
			for(int j=0; j<arrPattern.length ;j++)  // loop for pattern
			{
				if(arrStr[l]==arrPattern[j]) // if character matches 
				{
					l++; // increase to get char from original string
					match++;  // increase the match count of character
				}
				if(match==arrPattern.length) // match count equal pattern length increase pattern count
					count++;
			}
		}
		return count;
	}

	//Write a Java program to reverse String in Java without using any API?

	public static String reverseString(String input)
	{

		char [] inputVal= input.toCharArray(); //convert string into char array
		String reverseString=""; // initialize string with blank
		for(int i=inputVal.length-1 ;i>=0;i--) // pick from last
		{
			//System.out.print(i);
			reverseString=reverseString+inputVal[i]; // this line is not memory efficient

			/* Memory efficient line*/
			/*** reverseString=reverseString+input.charAt(i); //without using array  ***/

		}
		return reverseString;
	}

	//2) Write a Program to check if a String is a palindrome or not? (original or reverse is same or not)

	public static boolean Palindrom(String input)
	{

		char [] inputVal= input.toCharArray(); //convert string into char array
		String reverseString=""; // initialize string with blank
		for(int i=inputVal.length-1 ;i>=0;i--) // pick from last
		{
			//System.out.print(i);
			reverseString=reverseString+inputVal[i]; // this line is not memory efficient

			/* Memory efficient line*/
			/*** reverseString=reverseString+input.charAt(i); //without using array  ***/

		}
		if(reverseString.equals(input))
		{
			return true;
		}

		return false;
	}

	///	 Write a Java program to check if two String are Anagram or not?
	//compare two strings first their size then check original contains all the characters of input

	public static boolean checkAnagram(String Original ,String inputgram)
	{
		if(Original==null & inputgram==null)  //check input string is null or not
		{
			return false;
		}
		boolean anagram=false;  // create flag for checking anagram
		if(Original.length()==inputgram.length()) // if both string have equal length then first condition of anagram is true
		{
			for(int i=0; i<Original.length(); i++)
			{
				anagram=false;
				for(int j=0; j<inputgram.length(); j++)
				{	
					if(Original.charAt(i) == inputgram.charAt(j))
					{
						System.out.println(Original.charAt(i));
						anagram=true;
					}
				}
				if(!anagram)
				{
					return false;	
				}
			}
		}

		return anagram;
	}

	//another  version of anagram time efficient
	public static boolean anagramCheck(String Original ,String inputgram)
	{
		if(Original==null & inputgram==null)  //check input string is null or not
		{
			return false;
		}
		boolean anagram=false;  // create flag for checking anagram
		for( char val :inputgram.toCharArray())
		{
			anagram=false;
			if(Original.indexOf(val)!=-1) //if it is present then it will return the index else return -1
			{
				anagram=true;
			}
		}

		return anagram;
	}

	//Write a method in Java to remove any character from String

	public static String removeChar(String original , char forRemoval)
	{
		String modified="";

		for(char value: original.toCharArray()) //iterate for full string by converting into array
		{
			if(value!=forRemoval) //match with removal character and do not add in modified
			{
				modified =modified+value;
			}
		}

		return modified;
	}

	//Write a method to split a comma separated String in Java? //other method by using split function 

	public static void splitbasedOnchar(String original, char Patern)
	{
		String modified="";
		for(char val:original.toCharArray()) //iterate for all characters 
		{
			if(val!=Patern) //make string till not match
			{
				modified =modified+val;
			}
			else
			{
				if(modified!="")  // handling for printing blank
					System.out.println(modified);
				modified="";
			}
		}
		System.out.println(modified);
	}

	// Write Java program to print all permutations of a String

	public static void stringPermutation(String input)
	{
		String permComString="";

		for(int i=0;i<input.length();i++)
		{
			for(int j=i ;j<input.length();j++)
			{
				permComString=permComString+input.charAt(j);
			}

			int peramlength=permComString.length();
			for(int k=0 ;k<(input.length()-peramlength);k++)
			{
				permComString=permComString+input.charAt(k);
			}
			System.out.println(permComString);
			permComString="";
		}
	}


	public static void stringPermutationRecurse(String updatedParam,String inputPerm)
	{
		if(inputPerm.isEmpty())
		{
			System.out.println(updatedParam+inputPerm);
		}
		else
		{
		for(int i=0; i<inputPerm.length(); i++)
		{
			stringPermutationRecurse(updatedParam+inputPerm.charAt(i),inputPerm.substring(0, i)+inputPerm.substring(i+1, inputPerm.length()));
		}
		}
		
	}


	public static void main(String ...args)
	{
		String str1 ="I can do the wonder that other can not do.";
		String str2 ="I can do the wonder that other can not do.";
		boolean outVal=compareString(str1,str2);
		if(outVal)
			System.out.println("equal");
		else
			System.out.println("not equal");

		//check pattern match count method
		String strp ="ABCDefghijkpplABCDABCDprtsqopABCDtygpphfj";
		String Pattern="BCD";

		System.out.println("Pattern String: "+Pattern+" found: "+patternCount(strp,Pattern) +" times");

		//check reverse string function
		System.out.println(reverseString("ABSCD"));
		System.out.println(reverseString("ABCD ervcv"));

		//check string palindrom // equalignorecase is not considered in function
		System.out.println("Palindrom: "+Palindrom("ABC"));


		//Check Anagram function
		System.out.println("Anagram1: "+checkAnagram("ABC","CAB"));

		//anagram time efficient version
		System.out.println("Anagram2: "+anagramCheck("DBC","BCD"));

		//any character remove from string
		System.out.println("String after character remove: "+removeChar("AB eC Defg hI",' '));

		//split from comma or any character
		splitbasedOnchar("fppf,efdsd,ffddsd,f,d",',');

		//print string permutations
		stringPermutationRecurse("","123");

	}





}
