package day6;

public class Test {
	
	public static void main(String[] args) {
		
		//create an object of Student class and save it under ref variable
		Student student1 = new Student();
		student1.sid = 1001;
		student1.name = " David";
		student1.grade = 'A';
		
		student1.printStudentData();
		
		
		
		
		
		//employee info function
		Employee emp1 = new Employee();
		emp1.empid = 7007;
		emp1.name = "Smith";
		emp1.dept = "Finance";
		emp1.salary = 130000;
		
		emp1.display();
		
	}

}
