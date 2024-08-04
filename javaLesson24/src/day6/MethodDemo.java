package day6;

public class MethodDemo {
	//1: no param & no return
	
	public void methodOne() {
		System.out.println("This is method type1; no params and no return");
		
	}
	
	
	//2 no param, return value
	public String methodTwo() {
		String a = "Hello, ";
		String b = "This is method 2";
				
		return a+b;
	}
	
	
	//method 3 accepts param but doesnt return
	public void methodThree(String name) {
		System.out.println("Hello, my name is " + name);
	}
		
		
	//method4 accepts param and returns value
		public int add(int a, int b) {
			return (a+b);
	}
}