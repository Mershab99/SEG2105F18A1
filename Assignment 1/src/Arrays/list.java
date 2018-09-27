package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
	
	public static int sumIt = 0;
	public static int TEST_CASES  = 50000000;
	
	public static void main(String args[]) {
			
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		Iterator<Integer> iter = arrli.iterator();
	    
		long startTime = System.nanoTime();
		
		
		for(int i=0; i < TEST_CASES; i++) {
			arrli.add(Array.randFill());
			sumIt += iter.next();
			
		}	
		
		long endTime = System.nanoTime();
		System.out.println("done");
		
		System.out.println("The ArrayList ran for: " + (endTime - startTime) + " nanoseconds");
	}
}



