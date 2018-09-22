package Arrays;

import java.util.ArrayList;

public class list {
		
	public static void main(String args[]) {
			
		ArrayList<Integer> arrli = new ArrayList<Integer>(); 
		
		for(int i=0; i < 50000000; i++) {
			arrli.add(Array.randFill());
		}	
		System.out.println("done");
	}
}



