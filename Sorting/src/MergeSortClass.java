
public class MergeSortClass {

	public static int [] mergeSort(int inputarr[])
	{
		//find input size
		int inputArraySize = inputarr.length;
		
		if(inputArraySize<2)   //this is important condition, (stack overflow error occur)		  //because of further divison creates problem
			return inputarr;
		
		
		//As per algorithm divide each group and split into small arrays
		//step first find the mid of array
		
		int midIndex =inputArraySize/2 ;
		int leftSize =midIndex;
		int rightSize =inputArraySize-midIndex;
		//So first array start with 0 and ends before midIndex	
		int [] left = new int[leftSize]; //half size
		for(int i=0; i<midIndex;i++)
		{
			left[i]=inputarr[i];
		}
		//second array start with mid index and ends before input array size
		 int []right = new int[rightSize];
		for(int j=midIndex;j<inputArraySize;j++) 
		{
			right[j-midIndex]=inputarr[j];		
		}
		// iterative call means further divide till, it will not become single element
		mergeSort(left);
		mergeSort(right);				
		
		//merge the elements
		merge(left,right,inputarr);
		
		//above three line is very important, after full division it will goes to merging and all the previous information
		//the way all array is divided are kept into stack and they will re appear, in the manner which they were divided.
		//if you understand stack concept then it is very easy to understand,
		//initially i added the condition for stack, otherwise it will never stops and stack overflow error occur
		
		return inputarr;
		
	}

public static void merge(int []left, int []right,int []originalArr)
{
	int leftArrSize=left.length;
	int rightArrSize=right.length;
	//intially all index at 0th
	int leftArrInd=0 , rightArrInd=0, originalArrInd=0;
	//use while loops and put the value in original array
	//first loops which actual compares the value
	
	while(leftArrInd<leftArrSize && rightArrInd<rightArrSize) //if first condition fails second will not check and loop will not executed
	{
		if(left[leftArrInd]<=right[rightArrInd]) //actual comparison of both arrays values
		{
			originalArr[originalArrInd++]=left[leftArrInd++];
		}
		else
		{
			originalArr[originalArrInd++]=right[rightArrInd++];
		}
		
	}
	
	//copy left Array
	while(leftArrInd<leftArrSize)
	{
		originalArr[originalArrInd++]=left[leftArrInd++];
	}
	
	//copy right Array in same manner
	while(rightArrInd<rightArrSize)
	{
		originalArr[originalArrInd++]=right[rightArrInd++];
	}
	
}

public static void main(String ...args)
{
	int inputarr[] = {4,7,3,8,2,5,9,6};
	mergeSort(inputarr);
	
	for(int k=0; k<inputarr.length;k++ )
	{
		System.out.println(inputarr[k]);
	}
	

}

}
