import java.util.HashMap;

public class Dictionary {
	HashMap<String, String> map;

	public Dictionary() {
		map = new HashMap<>();
	}

	public void newEntry(String key, String value) {
		map.put(key, value);
	}

	public String look(String key) {
		String val = map.get(key);
		return val == null ? "Cant find entry for " + key : val;
	}
}