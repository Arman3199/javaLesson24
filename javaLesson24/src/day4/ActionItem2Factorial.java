package day4;

public class ActionItem2Factorial {

	public static void main(String[] args) {
		System.out.println("Factorial is: " + doFactorial(7));
		
		}

	
	public static long doFactorial(int number) { 
	//declare new int type variable
		long factorial = 1;
		while(number>1) {
			factorial *=number;//multiplying subsequent values with factorial
			number--;//decrementing given number in every iteration		
	}
		return factorial;//returning calculated value
		}
}