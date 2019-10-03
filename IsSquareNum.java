public class IsSquareNum {
	public static boolean isSquare(int n) {
		if (n < 0)
			return false;

		if (n == 0)
			return true;

		double a = Math.sqrt(n);
		int b = (int) Math.sqrt(n);
		return a / b > 1 ? false : true;
	}
}