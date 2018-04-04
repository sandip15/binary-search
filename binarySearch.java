
/**
  @author sandiproy
 */
package binarySearch;

public class binarySearch
{
	public static int searchTheElementInSortedArray(int [] array, int number) {
		if (array == null || array.length==0) {
			return -1;
		}
		
		int start=0;
		int end=array.length-1;
		
		while (start<=end) {
			int mid=(start+end)/2;
			if ((array[mid] == number) && ((mid==end) || (array[mid+1]>number))) {
				return mid;
			}
			else if (number<array[mid]) {
				end = mid-1;
			}
			else {
				start= mid+1;
			}
		}
		return -1;
		
	}
public static void main(String[] args) {
	int [] array = {2,2,3,3,3,4,5,5,6,6,7,7};
	int number = 7;
	int index = searchTheElementInSortedArray(array,number);
	System.out.println("the number"+number+ " was found in: " + index);
}
	
}