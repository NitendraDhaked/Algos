
public class HeapSortClass {

	public int [] heapSort(int inputarr[])
	{
		int windowSize=inputarr.length;
		
		//formula for finding heapify starting index
		int hStartInd= (windowSize/2)- 1;
		
		for(int i=hStartInd; i>=0; i--)  //iterate from heapify index to 0 index (which is root)
		{	
		heapify(inputarr,windowSize,i);
			
		}
		
		
		for(int i=inputarr.length-1 ;i>=0; i--)
		{
			int bigVal=inputarr[0];  //top always have largest element
			inputarr[0]=inputarr[i];
			inputarr[i]=bigVal;    //put the largest element at end
			
			//decrease the window size every time
			windowSize  =windowSize-1;  //do not add the element which is max value and placed at last index of array
			
			heapify(inputarr,windowSize,0);
		}
		
		return inputarr;
	}
	
	//gives the leftchild index
	public int leftChildIndex(int anyIndex)
	{
		int leftChildIndex = 2*anyIndex +1 ;
		return leftChildIndex;
	}
	
	//gives the rightchild index
	public  int rightChildIndex(int anyIndex)
	{
		int rightChildIndex = 2*anyIndex +2 ;
		return rightChildIndex;
	}
	
	//find the index of largest element
	public  void heapify(int [] arrayForHeapify, int windowSize, int startIndex)
	{
		//startIndex is the index which is selected for heapify process
		int heapiLargeElementIndex = startIndex;  //assume this index is largest element index 
		
		//by checking value of right and left node we will get largest element index
		
		int leftIndex= leftChildIndex(heapiLargeElementIndex);
		//use && sign if first fails then it will not evaluate second
		// & it evaluate both the side and then perform AND operation
		//in our case if it evaluate second even after first fails it throws exception
		if(leftIndex < windowSize && arrayForHeapify[leftIndex] > arrayForHeapify[heapiLargeElementIndex])
		{
			heapiLargeElementIndex=leftIndex;
		}
		
		int rightIndex= rightChildIndex(startIndex); //here you can't check right of heapifyStartIndex because which is updated above
												//or we can take both place index
		if(rightIndex <windowSize && arrayForHeapify[rightIndex] > arrayForHeapify[heapiLargeElementIndex])
		{
			heapiLargeElementIndex=rightIndex;
		}
		
		//check largest element index not equal start index (if yes means already largest, no need to swap with largest element)
		if(heapiLargeElementIndex!=startIndex)
		{
			int swap=arrayForHeapify[startIndex];
			arrayForHeapify[startIndex]=arrayForHeapify[heapiLargeElementIndex]; ///if recursively done than largest element at top of tree (0th index)
			arrayForHeapify[heapiLargeElementIndex]=swap;   // largest element index  value of array swap with root element because in above line we copied largest element on top(till 0th index) 
			
			//do recursively for updated tree and heapiLargeElementIndex
			heapify(arrayForHeapify,windowSize,heapiLargeElementIndex);
		}
	}
	
	

public static void main(String ...args)
{
	int inputarr[] = {4,7,3,8,2,5,9,6};
	int sortedArr [] = new HeapSortClass().heapSort(inputarr);
	
	for(int k=0; k<sortedArr.length;k++ )
	{
		System.out.println(sortedArr[k]);
	}
}
}
