package day3;

public class IfElseIfLadderDemo {
	public static void main(String[] args) {
		//if result >=90, grade is A
		//if result <90, grade is B
		// result >=60 >70 grade C
		//rest = F
	
		//use if else if statements
		int result = 95;
		
		if (result<=100 && result >=90) {
			System.out.println("Grade A");
		}
		else if (result<90 && result >=70) {
			System.out.println("Grade B");
		}
		else if (result<70 && result >=60) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Grade F");
		}
		
		
		
		
		
		
		
		
		
	}

}
