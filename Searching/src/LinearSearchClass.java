

//Linear or sequential search for array
public class LinearSearchClass 
{
	
	public static int LinearSearch(int []inputArray, int searchElement)
	{
		
		for(int i=0; i<inputArray.length;i++)
		{
			if(inputArray[i]==searchElement)
			{
				return i;
			
			}
		}
		
	return -1;
	}

	public static void main(String ...args)
	{
		int inputarr[] = {4,7,3,8,2,5,9,6};
		int searchKey=9;
		System.out.println(LinearSearch(inputarr,searchKey));
	}
}
