package day6;

public class Check_Palindrome {
	public static void main(String[] args) {
		//q5. check if string is palindrome or not
		
		String input="addd";
		System.out.println("Given strng is palindrome = " +isPalindrome(input));
		
		
	}

	public static boolean isPalindrome(String str) {
		
		String reversed= "";
		for(int i=str.length() -1; i>=0; i--) {
			reversed += str.charAt(i);
	
		}
		return str.equals(reversed);
		
		
	}
	
	
	
	
	
	
}
