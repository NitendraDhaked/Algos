
//https://en.wikipedia.org/wiki/Selection_sort
public class SelectionSortClass {
	
public static int [] selectionSort(int inputarr[])
	{
		int smallest;
		for(int i=0;i<inputarr.length;i++)
		{
			smallest=inputarr[i];  //assume first number is smallest
			int locSmall=i;       //position of first assumed smallest number
			for(int j=i;j<inputarr.length;j++)    // itterate for all numbers
			{
				if(smallest>inputarr[j])  //compare with next number of array, if it is small then rplace and store position in variable
				{
					smallest=inputarr[j];
					locSmall=j;
				}
			
			}
			inputarr[locSmall]=inputarr[i]; //replace smallest with assumed smallest number
			inputarr[i]=smallest; // replace with smallest number which is find
		}
		return inputarr;
	}
	
	public static void main(String ...args)
	{
		int inputarr[] = {4,7,3,8,2,5,9,6};
		int sortedArr [] =  selectionSort(inputarr);
		
		for(int k=0; k<sortedArr.length;k++ )
		{
			System.out.println(sortedArr[k]);
		}
		
		
	}

}
