package day4;

public class HowManyEvenOddNuminArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5, 10, 20, 25, 45, 99};
		int even =0;
		int odd = 0;
	
		for(int var:a) {
			if ((var%2) == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("Number of even numbers: " + even);
		System.out.println("Number of odd numbers: " + odd);
}
}