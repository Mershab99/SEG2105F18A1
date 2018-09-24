package Arrays;

import java.util.Vector;
import java.util.Random;

public class vect {
	
	
	public static int TEST_CASES = 50000000;
	
	public static void main(String args[]) {
		
		
		
		Vector<Integer> v = new Vector<Integer>(); 
		Random randInt = new Random();
		
		long startTime = System.nanoTime();
		
		for(int i=0; i < TEST_CASES; i++) {
			v.add(randInt.nextInt(10));
		}
		
		long endTime = System.nanoTime();
		System.out.println("done");
		
		System.out.println("Ran for: " + (endTime - startTime));
		
		
	}

}
