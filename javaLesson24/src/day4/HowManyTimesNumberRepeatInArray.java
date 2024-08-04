package day4;

public class HowManyTimesNumberRepeatInArray {

	public static void main(String[] args) {
		
		int a[]= {10, 20, 30, 45, 30, 40, 50, 20, 10};//array
		int numLookFor = 99;//# to look for in array
		int count = 0;
		
		for(int val:a) {
			if(val ==numLookFor) {
				count++;
			}
		}
		
		System.out.println(numLookFor + " is present " + count + " times");
		
	
	}
}
