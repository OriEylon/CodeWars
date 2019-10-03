public class CountOfPos_SumOfNeg {

	public static int[] countPositivesSumNegatives(int[] input) {
		int count = 0, sum = 0;
		if (input == null || input.length == 0)
			return new int[0];

		for (int i = 0; i < input.length; i++) {
			if (input[i] > 0)
				count++;
			else
				sum += input[i];
		}
		return new int[] { count, sum };
	}

}
