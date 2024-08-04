package day3;

public class SwitchStatementDemo {
	

	public static void main(String[] args) {
		/*
		 * conditional statements: if if else switch statement
		 **/

		/**
		 * sytnax of switch statement switch(variable) { case 1: { //code break; } case
		 * 2: { //code break; } default:{ //code } }
		 */

		int num = 1;
		switch (num) {
		case 1: {
			System.out.println("Monday");
			break;
		}
		case 2: {
			System.out.println("Tuesday");
			break;
		}
		case 3: {
			System.out.println("Wednesday");
			break;
		}
		default: {
			System.out.println("This number is not any day of the week");
		}
		}
		System.out.println("Out of switch statement");

		determineBrowser("chrome");

	}

	public static void determineBrowser(String browserName) {
			switch (browserName) {
			case "chrome": {
				System.out.println("Launch Google Chrome");
				break;
}
			case "firefox": {
				System.out.println("Launch firefox");
				break;
}
			case "edge": {
				System.out.println("Launch edge");
				break;
}
			default: {
				System.out.println("Browser option not available");	
}

	}
	}
}
