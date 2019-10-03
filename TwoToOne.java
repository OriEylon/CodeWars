public class TwoToOne {

	public static String longest(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		(s1 + s2).chars().distinct().sorted().forEach((c) -> sb.append((char) c));
		return sb.toString();
	}

	public static void main(String[] args) {
		String a = "dbeca";
		String b = "abc";
		System.out.println(longest(a, b));
		System.out.println("done");
	}
}