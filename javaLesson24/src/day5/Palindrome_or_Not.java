package day5;

public class Palindrome_or_Not {

	public static void main(String[] args) {

		int originalNum = 123, reverse = 0;
		System.out.println("The original number is: " + originalNum);
		int num = originalNum;
		while(num !=0) {
			int remainder = num%10;
			reverse = reverse*10 + remainder;
			num = num/10;
		}
		System.out.println("The reverse number is: " + reverse);
		if (originalNum == reverse) {
			System.out.println("It is palindrome");
		}
		else {
	            System.out.println(originalNum + " is not a palindrome.");

		}

		
		
		
		
		
	}

}
