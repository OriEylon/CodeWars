import java.util.Arrays;
import java.util.stream.Stream;

public class ShortestWord {
	public static int findShort(String s) {
		String[] arr = s.split(" ");
		Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());
		return arr[0].length();
//		return Stream.of(s.split(" ")).mapToInt(String::length).min().getAsInt();
	}
}