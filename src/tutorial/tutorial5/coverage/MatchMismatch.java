package tutorial.tutorial5.coverage;

public class MatchMismatch {
	public double matchRatio(int[] list, int value) {
		int match = 0, mismatch = 0;
		int counter = 0;
		while (counter < list.length) {
			if (list[counter] == value)
				match++;
			else
				mismatch++;
			counter++;
		}

		return (((double) match) / mismatch);
	}

	public static void main(String[] args) {
		MatchMismatch mm = new MatchMismatch();
		int[] list = { 1, 3, 5, 2, 3, 2, 3, 7 };

		System.out.println(mm.matchRatio(list, 3));

	}
}
