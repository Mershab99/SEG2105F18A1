package Arrays;

import java.util.Vector;
import java.util.Iterator;
import java.util.Random;

public class vect {
	
	public static int sumIt = 0;
	
	public static int TEST_CASES = 236000000;
	
	public static void main(String args[]) {
		
		Vector<Integer> v = new Vector<Integer>(); 
		Random randInt = new Random();
		
		long startTime = System.nanoTime();
		
		for(int i=0; i < TEST_CASES; i++) {
			v.add(randInt.nextInt(10));
		}
		
		long endTime = System.nanoTime();
		
		long sumTime = System.nanoTime();
		
		Iterator<Integer> iter = v.iterator();
		
		while(iter.hasNext()) {
			sumIt += iter.next();
		}
		
		long endSumTime = System.nanoTime();
		
		System.out.println("done");
		System.out.println("Vector ran for: " + (endTime - startTime) + " nanoseconds");
		System.out.println("Vector's iterator ran for: " + (endSumTime - sumTime) + " nanoseconds");
		
		
	}

}
