package searchAlgorithms;



/* LINEAR SEARCH ALGORITHM:
 * This is the simplest algorithm to searcg an element in a given array. We simply traverse the array across length
 * and compare the array element with the required element. If the element matches, we return the index of the array element
 * otherwise we continue the search until the end of the array and return -1 if the element is not found.
 * 
 * Time complexity : O(n)
 */


//Given an array arr[] of n elements, write a function to search a given element x in arr[].

public class LinearSearch {
	
	//Method to linnearly travere the array and compare the elements with the given element and return the index or -1 if the element is not present.
	public static int searchElement(int arr[],int x) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
	
	
	//method to print the final result i.e. if the element is present or not in the givenn array.
	public static void printResult(int res) {
		if(res==-1) {
			System.out.println("Element is not present in the given array");
		}
		else {
			System.out.println("Element is present at index  :" +res);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {12,14,16,17,109,41,24};
		int x=14;
		int result = searchElement(arr,x);
		printResult(result);
		
		x =10;
		result = searchElement(arr,x);
		printResult(result);
		
		
		
	}

}
