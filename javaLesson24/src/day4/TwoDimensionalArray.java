package day4;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		
		//declaration
		int a[][] = new int[3][2];
		
		//assigning values to cells
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0] = 600;
		a[1][1] = 700;
		
		a[2][0] = 800;
		a[2][1] = 900;
		
System.out.println(a[1][1]);// extracting single value out of array/700


int b[][] = {{1,2}, {3,4,0}, {5,6,8,9}};//outer bracket is first array, inner bracket is values inside
System.out.println(b[2][1]);//print 6 from array

//print all values of 2d array
System.out.println("Print all valules of 2d array: ");
for(int i=0; i<a.length; i++) {
	for(int j=0; j<a[i].length; j++) {
		System.out.println(a[i][j]);
	}
}

System.out.println("Printing all values from b array: ");
for(int i=0; i<b.length; i++) {
	for(int j=0; j<b[i].length; j++) {
		System.out.println(b[i][j]);
	}
}
		
System.out.println("Extracting all values using enhanced for loop: ");
for(int arr[]:b)//accessing outer bracket 
	{
	for(int x :arr)//inner bracket 
		{
		System.out.print(x + " "); //printing each array separately
	}
	System.out.println();
}
		
		
	}

}
