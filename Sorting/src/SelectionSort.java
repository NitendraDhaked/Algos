
public class SelectionSort 
{
	
	public static int[] selectionSort(int ...unSorted)
	{
		for(int i=0; i<unSorted.length-1;i++)
		{
			int minNumIndex=i;
			for(int j=i+1;j<unSorted.length;j++)
			{
				if(unSorted[j]<unSorted[minNumIndex])
				{
					minNumIndex=j;	
				}
			}	
				int smallNumber=unSorted[minNumIndex];
				unSorted[minNumIndex]=unSorted[i];
				unSorted[i]=smallNumber;
			
			
		}
		
		return unSorted;
	}
	
	public static void main(String ...strings)
	{
		int [] unSorted={3,2,5,8,4,1,7,6};

		int []sorted=selectionSort(unSorted);
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
			
		}

	}

}
