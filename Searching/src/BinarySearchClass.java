

public class BinarySearchClass 
{
	//using divide and conquer method
	public static int binaySearch(int []inputArray, int searchElement)
	{
		
		int start =0;
		int end = inputArray.length;
		while(start<end){
			int mid =(start+end)/2;  //use any formula to find mid
			System.out.println("formula1: "+mid);
			int mid1=start+(end-start)/2;
			System.out.println("formula2: "+mid1);
			if(inputArray[mid]==searchElement)
			{
				return mid;  //return index of search element
			}
			if(searchElement<inputArray[mid])
			{
				end= mid ; //updating end value
			}
			else
			{
				start=mid+1; //updating start value
			}
			
		}
		
		return -1;
	}
	public static int binarySearchRecursive(int []inputArray, int searchElement, int start, int end)
	{
		
		if(start<end)
		{
			int mid = start+(end-start)/2;
			if(searchElement<inputArray[mid])
			{
				return binarySearchRecursive(inputArray, searchElement,start,mid);
			}
			else if(searchElement>inputArray[mid])
			{
				return binarySearchRecursive(inputArray,searchElement,mid+1,end);
			}
			else
			{
			 return mid;	
			}
		}
		
		return -1;
	}
	
	public static void main(String ...args)
	{
		int inputarr[] = {2,3,4,5,6,7,8,9};
		int searchKey=5;
		System.out.println(binaySearch(inputarr,searchKey));
		System.out.println(binarySearchRecursive(inputarr,searchKey,0,inputarr.length));
	}

}
