public class CountingDuplicates {
	public static int duplicateCount(String text) {
		int count = 0;
		int[] chars = new int[256];
		text = text.toLowerCase();
		for (int i = 0; i < text.length(); i++) {
			chars[text.charAt(i)]++;
		}

		for (int i = 0; i < 256; i++) {
			if (chars[i] > 1)
				count++;
		}
		return count;
	}
}