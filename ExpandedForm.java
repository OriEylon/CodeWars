import java.util.ArrayList;

public class ExpandedForm {
	public static String expandedForm(int num) {
//		70304=70000+300+4
		StringBuilder sb = new StringBuilder();
		int mod = 10, digit;
		ArrayList<Integer> arr = new ArrayList<>();
		while (num > mod) {
			digit = num % mod;
			if (digit != 0) {
				arr.add(0, digit);
				num -= digit;
			}
			mod *= 10;
		}
		arr.add(0, num);
		arr.forEach((i) -> sb.append(i + " "));
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString().replace(" ", " + ");
	}

	public static void main(String[] args) {
		System.out.println(expandedForm(12));
	}
}