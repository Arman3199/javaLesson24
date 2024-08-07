package day6;
import java.util.Arrays;
public class Sort_Elements_in_Array {

	public static void main(String[] args) {
		int array[] = {89, 76, 2, 34, 5, 7, 56, 4};
        
		//array before sorting
       System.out.println("Array before sorting: " + Arrays.toString(array));
       
       Arrays.sort(array); //sort elements of given array
       
       System.out.println("Elements of array sorted in ascending order: ");
       
       for(int value : array) {          
       System.out.print(value + " ");              
       }
       System.out.println();
       sortMyArray(array);
   }



public static void sortMyArray(int[] givenArray) {
	int length = givenArray.length;
	for(int i=0; i<length; i++) {
		for (int j=0; j<length -i-1; j++) {
			if(givenArray[j]>givenArray[j+1]) {
				int temp = givenArray[j];
				givenArray[j] = givenArray[j+1];
				givenArray[j+1] = temp;
			}
		}
	}
	System.out.println("Sorted array: ");
	
	for(int value: givenArray) {
		System.out.print(value + " ");
	}
}


}


