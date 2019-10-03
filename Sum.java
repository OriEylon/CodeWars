public class Sum {
	public int GetSum(int a, int b) {
		// Good luck!
		int x, y, sum = 0;
		if (a == b)
			return a;
		if (a > b) {
			x = b;
			y = a;
		} else {
			x = a;
			y = b;
		}
		for (; x <= y; x++) {
			sum += x;
		}
		return sum;
		// return (a + b) * (Math.abs(a - b) + 1) / 2;
	}
}