//   @assignment: Homework-3 
// Jackson, both iterative and recursive solutions have been cross-checked with Professor Duraisamy for HW-3.

public class TowerOfHanoiIterative {
	static public void main(String args[]) {

		int N = 4;
		int move, s = 0;
		int third, pos2, pos3, j, i = 1;
		int[] position = new int[N + 2];

		for (j = 0; j < N; j++)
			position[i] = 0;
		position[N + 1] = 2;
		move = 1;
		for (i = 1; i <= N; i++)
			move *= 2;
		move -= 1;
		for (i = 1; i <= move; i++) {
			if (i % 2 == 1) {

				s = position[1];

				position[1] = (position[1] + 1) % 3;

				System.out.print("Move disc 1 to ");
				System.out.println((char) ('A' + position[1]));
				
			} else {

				third = 3 - s - position[1];

				pos2 = N + 1;
				for (j = N + 1; j >= 2; j--)
					if (position[j] == s)
						pos2 = j;
				
				pos3 = N + 1;
				for (j = N + 1; j >= 2; j--)
					if (position[j] == third)
						pos3 = j;
				System.out.print("Move disc ");

				if (pos2 < pos3) {
					System.out.print(pos2);
					System.out.print(" to ");
					System.out.println((char) ('A' + third));
					position[pos2] = third;
				
				} else {
					System.out.print(pos3);
					System.out.print(" to ");
					System.out.println((char) ('A' + s));
					position[pos3] = s;
				}
			}
		}
	}
}