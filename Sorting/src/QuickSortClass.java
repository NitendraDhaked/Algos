
public class QuickSortClass {

	public static int [] quickSort(int inputarr[],int current, int index, int pivot)
	{
		//pivot is the last index of any list
		
		while(current<pivot)  //loops runs always less than pivot index
		{
			if(inputarr[current]>inputarr[pivot])
			{
				current++;       //if current index value is greater than pivot index value do not swap
			}
			else     //less than or equal to pivot value than swap with index value with current value
			{
				int swap=inputarr[index];
				inputarr[index]=inputarr[current];
				inputarr[current]=swap;
				current++;
				index++;
			}
			
		}
		if(inputarr[index]>inputarr[pivot])  //where current and pivot are equal than swap index with pivot
		{
			int temp=inputarr[pivot];
			inputarr[pivot]=inputarr[index];
			inputarr[index]=temp;
			quickSort(inputarr,index,index,pivot);
		}
		else //call the recursively sort algorithm till pivot is not reached to 0
		{
			if(pivot!=0)
			quickSort(inputarr,0,0,pivot-1);
		}
	
		return inputarr;
	}

public static void main(String ...args)
{
	int inputarr[] = {4,10,3,8,2,5,9,2};
	int current=0; //intially current and index at same point
	int index =0;  //same with current
	int sortedArr [] =  quickSort(inputarr,current,index,inputarr.length-1);
	
	for(int k=0; k<sortedArr.length;k++ )
	{
		System.out.println(sortedArr[k]);
	}

}

}
