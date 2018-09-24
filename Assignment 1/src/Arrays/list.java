package Arrays;

import java.util.ArrayList;

public class list {
		

	public static int TEST_CASES  = 50000000;
	
	public static void main(String args[]) {
			
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		
		long startTime = System.nanoTime();
		
		for(int i=0; i < TEST_CASES; i++) {
			arrli.add(Array.randFill());
		}	
		
		long endTime = System.nanoTime();
		System.out.println("done");
		
		System.out.println("The ArrayList ran for: " + (endTime - startTime) + " nanoseconds");
	}
}



