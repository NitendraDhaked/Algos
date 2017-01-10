
public class InsertionSortClass 
{
	
public static int[] doInsertionSort(int inputarr[])
{
	int temp;
	for(int i=0; i<inputarr.length; i++)
	{
		
		for(int j=i ; j>0; j--) //start with ith place run till 0th place (comparison of small group)
		{
			if(inputarr[j]<inputarr[j-1])  //if jth  value is less than j-1 then replace it(previous)
			{
				temp=inputarr[j];
				inputarr[j]=inputarr[j-1];
				inputarr[j-1]=temp;
			}
		}
	}
	return inputarr;
}

// the only difference between bubble sort and insertion sort is that, in insertion sort we are comparing chunk
// of sorted array with next element each time while in bubble sort we are comparing next element with previous
// which reduces the space complexity because we are comparing one element at a time so space complexity is order of 1 while insertion sort space complexity is order of n in total
public static void main(String ...args)
{
	
	int inputarr[] = {4,7,3,8,2,5,9,6};
	int sortedArr [] =  doInsertionSort(inputarr);
	
	for(int k=0; k<sortedArr.length;k++ )
	{
		System.out.println(sortedArr[k]);
	}
}
	
}
