/* @author: Nehul Yadav
 * @Lab 3
 * A robust program that implements a functionality to output the runtime of 3 different algorithms A, B and C for 2000<= n <= 20,000 where n is a multiple of 2000.
 */

//Program 1: Working Solution!

public class Lab3 {

	//Calculating run time for Algorithm A.
	public static void main(String[] ar) {
		int sum = 0;
		int n = 0;
		while(n != 20000) {
			n = n + 2000;			

			int sum_A = 0;
			for(int i = 1; i <= n; i++) {
				sum_A = sum_A + i; }
			System.out.println("Runtime for Algorithm A = " + System.nanoTime() + ", n = " + n);

			//Calculating run time for Algorithm B.
			for(int i = 1; i <= n; i++) {
				for(int j = 1; j <= i; j++) {
					sum = sum + 1;
				}
				sum = sum + i; }
			System.out.println("Runtime for Algorithm B = " + System.nanoTime() + ", n = " + n);

			//Calculating run time for Algorithm C.
			for(int i = 1; i < n; i++) {
				sum = sum + i; }
			System.out.println("Runtime for Algorithm C = " + System.nanoTime() + ", n = " + n);
			String newLine = System.getProperty("line.separator");
			System.out.println(newLine);
		}

	}
}