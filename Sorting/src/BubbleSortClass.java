//https://en.wikipedia.org/wiki/Bubble_sort
public class BubbleSortClass {
	
public static int [] bubbleSort(int inputarr[])
	{
		int swap;
		for(int i=0;i<inputarr.length;i++)
		{
			for(int j=0;j<inputarr.length-1;j++)
			{
				if(inputarr[j]>inputarr[j+1]) //compare with next element if it is small than swap it
				{
					swap=inputarr[j+1];
					inputarr[j+1]=inputarr[j];
					inputarr[j]=swap;
					
				}
			}
			
		}
		return inputarr;
	}
	
	public static void main(String ...args)
	{
		int inputarr[] = {4,7,3,8,2,5,9,6};
		int sortedArr [] =  bubbleSort(inputarr);
		
		for(int k=0; k<sortedArr.length;k++ )
		{
			System.out.println(sortedArr[k]);
		}
		
		
	}

}
