package day3;
import java.util.Scanner;
public class BrowserSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dbrowser;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter one of the browsers to launch: chrome, edge, or firefox: ");
		dbrowser = scan.next();
		switch (dbrowser) {
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