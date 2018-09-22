package Arrays;
import java.util.Random;


public class ArrayList {
	
	private static int anArray[];
	
	public static int[] array() {
		anArray = new int[100];
		for(int i=0; i < anArray.length; i++) {
			anArray[i] = randFill();
		}
		return anArray;	
	}
	
	public static int randFill() {
		Random randInt = new Random();
		int rand = randInt.nextInt();
		return rand;
	}
	
	public static void main(String args[]) {
		array();
		for(int i =0; i<anArray.length; i++) {
			System.out.println(anArray[i]);
		}
	}
	

}
