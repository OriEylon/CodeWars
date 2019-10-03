public class Dubstep {
	public static String SongDecoder(String song) {
		String original = "";
		String[] arr = song.split("WUB");
		for (String s : arr) {
			if (!s.isEmpty())
				original += s + " ";
		}

		return original.trim();
//		return song.replaceAll("(WUB)+", " ").trim();
	}

	public static void main(String[] args) {
		String s1 = "WUBWUBABCWUB";
		String s2 = "RWUBWUBWUBLWUB";
		String s3 = "WUBWEWUBAREWUBWUBTHEWUBCHAMPIONSWUBMYWUBFRIENDWUB";
		System.out.println(SongDecoder(s1));
		System.out.println(SongDecoder(s2));
		System.out.println(SongDecoder(s3));
	}
}