import java.util.LinkedList;

public class sortTheOdd {
	public static int[] sortArray(int[] array) {
		int n = array.length;
		if (n == 0)
			return array;
		int[] tmp = new int[n];
		LinkedList<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 == 0)
				tmp[i] = array[i];
			else
				list.add(array[i]);
		}
		list.sort((i1, i2) -> i1 - i2);
		for (int i = 0; i < n; i++) {
			if (array[i] % 2 != 0)
				tmp[i] = list.poll();
		}
		return tmp;
	}
}
