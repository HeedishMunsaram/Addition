import java.util.Scanner;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class Mymethod1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//define scanner
		Scanner key = new Scanner(System.in);
		
		// define our variables
		int x, y, sum;
		
		// tell the user to inputs
		System.out.println("Enter num1:");
		x = key.nextInt();
		
		System.out.println("Enter num2:");
		y = key.nextInt();
		
		sum = sumInt(x, y);
		System.out.println("Sum is :" + sum);

	}
	
	/**
	 * Method to add two integers
	 * @param num1 to add
	 * @param num2 to add
	 * @return sum of num1 and num2
	 */
	public static int sumInt(int num1, int num2) {
		return (num1+num2);
	}

}
