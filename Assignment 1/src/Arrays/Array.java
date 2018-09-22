package Arrays;
import java.util.Random;


public class Array {
	
	private static int anArray[];
	
	public static int[] array() {
		anArray = new int[2500000];
		for(int i=0; i < anArray.length; i++) {
			anArray[i] = randFill();
		}
		return anArray;	
	}
	
	public static int randFill() {
		Random randInt = new Random();
		int rand = randInt.nextInt(10);
		return rand;
	}
	
	public static void main(String args[]) {
		array();
		for(int i =0; i<anArray.length; i++) {
			System.out.println(anArray[i]);
		}
		
		System.out.println("done");
	}
	

}
