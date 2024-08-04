package day6;

public class Test_Methods {

	public static void main(String[] args) {
		
		//calling method 1
		MethodDemo m = new MethodDemo();
		m.methodOne();
		
		//method2
		String result = m.methodTwo();
		System.out.println(result);
		
		
		//method3
		m.methodThree("Salll");
		
		//method4
		int sum = m.add(100,300);
		System.out.println(sum);
		
		
	}













}
