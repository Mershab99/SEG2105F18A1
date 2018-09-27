package Arrays;
import java.util.Random;


public class Array {
	public static Random randInt = new Random();
	public static int randFill() {
		
		int rand = randInt.nextInt(10);
		return rand;
	}
	
	public static int sumArr = 0;
	
	public static void main(String args[]) {
	
		int[] anArray = new int[];
		long startTime = System.nanoTime();
		
		for(int i=0; i < anArray.length; i++) {
			anArray[i] = randFill();
		}
		long endTime = System.nanoTime();	
		
		long sumTime = System.nanoTime();
		
		for(int i= 0; i < anArray.length; i++) {
			sumArr += anArray[i];
		}
		
		long sumEndTime = System.nanoTime();
		
		
		System.out.println("done");
		System.out.println("The Array ran for: " + (endTime - startTime) + " nanoseconds");
		System.out.println("The Array's sum ran for: " + (sumEndTime - sumTime) + " nanoseconds");
		
	}
	

}
