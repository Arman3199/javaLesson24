package day6;

public class ConstructorDemo {
	String name;
	String streetName;
	int houseNum;
	String ZipCode;
	
	public ConstructorDemo(String name, String streetName, int houseNum, String ZipCode) {
		this.name = name;
		this.streetName = streetName;
		this.houseNum = houseNum;
		this.ZipCode = ZipCode;
	}
	
	
	public String declareAddress() {
		return(name + "\n" + houseNum +"," +streetName + "\n" + ZipCode);
	}

}
