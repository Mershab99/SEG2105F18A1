package Arrays;
import java.util.Random;


public class Array {
	
	public static int randFill() {
		Random randInt = new Random();
		int rand = randInt.nextInt(10);
		return rand;
	}
	
	public static void main(String args[]) {
	
		long startTime = System.nanoTime();
		int[] anArray = new int[10];
		
		//int sum = 0;
		
		for(int i=0; i < anArray.length; i++) {
			anArray[i] = randFill();
			//sum += anArray[i];
		}
		long endTime = System.nanoTime();	
		
		System.out.println("done");
		//System.out.println("The sum of the array is: " + sum);
		
		System.out.println("The Array ran for: " + (endTime - startTime) + " nanoseconds");
		
	}
	

}
