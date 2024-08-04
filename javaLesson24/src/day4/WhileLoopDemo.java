package day4;

public class WhileLoopDemo {
	public static void main(String[] args) {
/*
		//print 1 to 5 using while loop
		int num = 1;
		while(num<=5) {
			System.out.println(num);
			num ++;
		}
	}

	//print 1 to 5 using do while loop
	System.out.println("**using do while loop**");
	int numbeR = 1;
	do {
		System.out.println(numbeR);
		numbeR++;
	} while(numbeR<=5);
}
*/
		
	for(int i=1; i<=10; i++) {
		System.out.println(i);
		//keeping code intact, exclude print 6-10
		if(i==5) {
			break;//jumping statement, jumping out of sequence
		}
	}
		System.out.println("Situation2");
		//sitaution2:print all #s except 5 
	for(int i =1; i<=10; i++) {
		if (i==5) {
			continue; //skip current sequence
		}
		System.out.println(i);
	}
		
		
		
}
}
