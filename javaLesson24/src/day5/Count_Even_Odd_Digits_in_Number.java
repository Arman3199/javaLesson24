package day5;

public class Count_Even_Odd_Digits_in_Number {
	public static void main(String[] args) {
		int num=251, count=0;
		
		while(num>0) {
			num /=10;
			count++;
		}
		System.out.println("# of digits: " + count);
	
		
	}

}
