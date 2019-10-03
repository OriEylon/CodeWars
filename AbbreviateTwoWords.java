public class AbbreviateTwoWords {

	public static String abbrevName(String name) {
		return (name.split(" ")[0].charAt(0) + "." + name.split(" ")[1].charAt(0)).toUpperCase();
	}

	public static void main(String[] args) {
		String s1 = "Ori Eylon";
		String s2 = "ori eylon";
		System.out.println(abbrevName(s1));
		System.out.println(abbrevName(s2));
	}
}