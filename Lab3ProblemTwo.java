
//The correct n value comes out to be 2000. I have checked with Professor Ghosh.

public class Lab3ProblemTwo {

	public static void main(String[] ar) {
		int sum = 0;

		//loop A
		long startTime = System.currentTimeMillis();

		for (int n = 1; n <= 10000; n++) {
			for (int i = 1; i <= n; i++) {

				for (int j = 1; j <= 10000; j++) {
					sum = sum + j;
				}

				long stopTime = System.currentTimeMillis();
				long elapsedTime = stopTime - startTime;


				//loop B
				long startTime2 = System.currentTimeMillis();
				for (int k = 1; k <= n; k++) {
					for (int j = 1; j <= n; j++) {
						sum = sum + j;
					}
					long stopTime2 = System.currentTimeMillis();
					long elapsedTime2 = stopTime2 - startTime2;
					
					if(elapsedTime2 < elapsedTime) {
						System.out.println("The upper bound in the interval [1,n] is" + n);
						
					}

				}
			}
			
		}
	}
}
