package day4;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int myArray[] = new int[5];//declaring array
		//assigning values to array
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		myArray[4] = 50;
		
		System.out.println(myArray[4]); //extracting value from array
		
		//finding out length of array
	int length = myArray.length;
	System.out.println("The length of array is: " + length);
	
	int a[] = {1, 2, 3, 4, 5};//declaring & assigning values simultaneously to array
	System.out.println(a[4]);
	
	//extracting all values of array
	System.out.println(Arrays.toString(myArray));
	
	//print all values using for loop
	for(int i=0; i<5; i++) {
		System.out.println(a[i]);
	}
	
	System.out.println("**using enhanced for loop to extract all values in array**");
	//use enhanced for loop to print all values of array
	for(int mA:myArray) {
		System.out.println(mA);
	}
	System.out.println("**extracting last to first index of array**");
	//printing values from last to first index
	for(int i= 4; i>=0; i--) {
		System.out.println(a[i]);
	}
	
	}

}
