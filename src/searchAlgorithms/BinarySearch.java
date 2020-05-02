package searchAlgorithms;


/* Binary Search Algorithm:
 * Search a sorted array by repeatedly dividing the search interval in half. 
 * Begin with an interval covering the whole array. 
 * If the value of the search key is less than the item in the middle of the interval, narrow the interval to the lower half.
 *  Otherwise narrow it to the upper half. Repeatedly check until the value is found or the interval is empty.
 *  
 *  Time Complexity : O(logn)
 */

public class BinarySearch {
	
	public static int binarySearchAlgo(int arr[],int low,int high, int x) {
		if(high >= low) {
		int mid = (low + high) /2;
		if(arr[mid]==x) {
			return mid;
		}
		else if(arr[mid] > x) {
			return binarySearchAlgo(arr,low,mid-1,x);
		}
		else {
			return binarySearchAlgo(arr,mid+1,high,x);
		}
		}
		return -1;
	}
	
	public static void printResult(int res) {
		if(res==-1) {
			System.out.println("Element is not found in the array");
		}
		else {
			System.out.println("Element is at index : " +res);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12,17,31,67,69,92};
		int x= 67;
		
		int result = binarySearchAlgo(arr,0,arr.length-1,x);
		printResult(result);
		
		x=19;
		result = binarySearchAlgo(arr,0,arr.length-1,x);
		printResult(result);	
		
	}

}
