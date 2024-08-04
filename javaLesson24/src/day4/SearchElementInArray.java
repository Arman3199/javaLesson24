package day4;
import java.util.Scanner;

public class SearchElementInArray {

	public static void main(String[] args) {
		
		//create array
		int a[]= {10, 40, 30, 60, 50, 90, 80};
		Scanner sc = new Scanner(System.in);//object to read user input
		System.out.println("Enter number to search for: ");
		
		boolean status = false; //create status state
		int search_num = sc.nextInt();//declare number to search
		
		for(int i=0; i<a.length; i++) {
			if(search_num == a[i]) {
			System.out.println("Element found!");
			status = true;
			break;
		}
		}
		if(status == false) {
			System.out.println("Sorry!! Element not found.");
		}
		
		
		
		

	}

}
