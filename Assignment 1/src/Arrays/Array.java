package Arrays;
import java.util.Random;


public class Array {
	public static Random randInt = new Random();
	public static int randFill() {
		
		int rand = randInt.nextInt(10);
		return rand;
	}
	
	public static void main(String args[]) {
	
		long startTime = System.nanoTime();
		int[] anArray = new int[10];
		
		//int sum = 0;
		
		for(int i=0; i < anArray.length; i++) {
			anArray[i] = randFill();
<<<<<<< HEAD
			//sum += anArray[i];
=======
			System.out.println(anArray[i]);
			//sum += anArray[i];
			//System.out.println(sum);
>>>>>>> 632785cfa5fe53616d19aedcbb413cf3cbaa48ca
		}
		long endTime = System.nanoTime();	
		
		System.out.println("done");
		//System.out.println("The sum of the array is: " + sum);
		
		System.out.println("The Array ran for: " + (endTime - startTime) + " nanoseconds");
		
	}
	

}
