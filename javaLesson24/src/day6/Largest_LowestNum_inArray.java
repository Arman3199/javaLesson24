package day6;
import java.util.Arrays;

public class Largest_LowestNum_inArray {

	public static void main(String[] args) {
		//q4) find largest&lowest numbers of array
		
		int arr[]= {3,8,2,67,43,34};
		
		int min=arr[0];
		int max=arr[0];
		
		//loop through array to determine min & max
		for(int i=0; i<arr.length; i++) {
			if(arr[i] <min) {
				min=arr[i];
			} else if (arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("The min number is is: " +min);
		System.out.println("The max number is is: " +max);
	
	//using predefined functions/library to get min/max
		int mini= Arrays.stream(arr).min().getAsInt();
		int maxi= Arrays.stream(arr).max().getAsInt();
		
		System.out.println("The min number is is: " +mini);
		System.out.println("The max number is is: " +maxi);
	
	
	
	
	
	
	}
	
	
	
	



}
