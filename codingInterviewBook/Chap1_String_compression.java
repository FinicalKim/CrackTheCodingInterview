package codingInterviewBook;

import java.util.HashSet;
import java.util.Hashtable;

public class Chap1_String_compression {

	public static void main(String[] args) {
		String str = "aabcccccaaa";
		
		stringCompression(str);

	}

	public static String stringCompression(String str) {
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		HashSet<Character> hs = new HashSet<Character>();
		
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			
		}
		
		return str;
	}
	
}
