public class Invert {
	public static int[] invert(int[] array) {
		int[] newarr = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			newarr[i] = -array[i];
		}
		return newarr;
	}
}