package CrackingTheCodingInterview;

public class Chap1_Is_Unique {

	public static void main(String[] args) {
		String word = "djfhgsalkjhgfl!ksdajfhla";
		System.out.println(isUnique(word));
	}
	
		public static boolean isUnique(String str) {
			
			if (str.length() > 128) {
				return false;
			}
			
			boolean[] char_set = new boolean[128];
			for (int i = 0; i < str.length(); i++) {
				int val = str.charAt(i);
				if (char_set[val]) {	// Already found this character in string
					return false;
				}
			}
			
			return true;
			
		}

}
