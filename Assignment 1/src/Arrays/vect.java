package Arrays;

import java.util.Vector;
import java.util.Random;

public class vect {
	
	public static void main(String args[]) {
		
		Vector<Integer> v = new Vector<Integer>(); 
		Random randInt = new Random();
		
		for(int i=0; i < 50000000; i++) {
			v.add(randInt.nextInt(10));
		}	
		System.out.println("done");
	}

}
