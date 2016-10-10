
public class BubbleSort 
{
	static int temp;
	public static int [] bubbleSort(int ...unSorted)
	{
		for(int i=0; i<unSorted.length-1;i++)
		{
			for(int j=0;j<unSorted.length-1;j++)
			{
				if(unSorted[j]>unSorted[j+1])
				{
					temp=unSorted[j+1];
					unSorted[j+1]=unSorted[j];
					unSorted[j]=temp;
				}
			}
			
		}
		return unSorted;
		
	}
	
	
	public static void main(String ...strings)
	{
		int [] unSorted={3,2,5,8,4,1,7,6};

		int []sorted=bubbleSort(unSorted);
		
		for(int i=0;i<sorted.length;i++)
		{
			System.out.println(sorted[i]);
			
		}

	}

}
