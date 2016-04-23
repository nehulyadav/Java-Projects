//This is a recursive approach to solve the problem.
//It works!!
public class TowersOfHanoiRecursion {
	public static String hanoi(int nDisks, int fromPeg, int toPeg) {
		int helpPeg;
		String s1, s2, change, concatOutput;
		;

		if (nDisks == 1)
			return "Move from " + fromPeg + " to " + toPeg + "\n";
		else {
			helpPeg = 6 - fromPeg - toPeg; // fromPeg + helpPeg + toPeg = 6

			s1 = hanoi(nDisks - 1, fromPeg, helpPeg);
			change = "Move from " + fromPeg + " to " + toPeg + "\n";
			s2 = hanoi(nDisks - 1, helpPeg, toPeg);

			concatOutput = s1 + change + s2; // + = String concatenation !

			return concatOutput;
		}
	}

	public static void main(String[] args) {
		int n = 4;

		String answer = hanoi(n, 1, 3);

		System.out.println(answer);
	}
}
