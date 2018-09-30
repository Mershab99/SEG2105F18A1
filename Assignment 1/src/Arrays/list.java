package Arrays;

import java.util.ArrayList;
import java.util.Iterator;

public class list {
	
	public static int sumIt = 0;
	public static int TEST_CASES  = 236000000;
	
	public static void main(String args[]) {
		
		long startTime = System.nanoTime();
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		
		for(int i=0; i < TEST_CASES; i++) {			
			arrli.add(Array.randFill());			
		}

		long endTime = System.nanoTime();
		
		long sumTime = System.nanoTime();
		
		Iterator<Integer> iter = arrli.iterator();
		
		while(iter.hasNext()) {
			sumIt += iter.next();
		}
		
		long endSumTime = System.nanoTime();
		
		
		System.out.println("done");
		System.out.println("The ArrayList ran for: " + (endTime - startTime) + " nanoseconds");
		System.out.println("The ArrayList's iterator ran for: " + (endSumTime - sumTime) + " nanoseconds");
	}
}



