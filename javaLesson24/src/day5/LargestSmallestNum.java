package day5;

public class LargestSmallestNum {

	public static void main(String[] args) {
		
		int a=78, b=58, c=21, largest, smallest;
		largest = (a>b) ? a : b;
		System.out.println("The largest number is: " + largest);
		
		smallest = c <(a < b ? a : b) ? c:(a < b ? a : b);
		System.out.println("The smallest number is: " + smallest);
		
		
		
		
		
		
		
	}

}
