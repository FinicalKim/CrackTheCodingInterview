package codingInterviewBook;
import java.util.*;

public class anagramQ {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		
		str.add("poce");
		str.add("pcoe");
		str.add("oepc");
		str.add("tangle");
		str.add("boats");
		
		int n = str.size();
		anagram(str, n);
		
	}
	
	public static void anagram(ArrayList str1, int n) {
			// stores final result
		Vector<String> ans = new Vector<String>();
			// stores the previous occurred string
		HashSet<String> found = new HashSet<String>();
		
		for (int i = 0; i < n; i++) {
				// sets each string of str1.get(i) to word then compares if the word
			String word = (String) str1.get(i);
				// sorts the string in word alphabetically 
			word = sort(word);
				
				// checks to see if word is in set found otherwise add str1.get(i) to ans set
			if (!found.contains(word)) {
				ans.add((String) str1.get(i));
				found.add(word);
			/*	System.out.println(i);
				System.out.println("ans" + ans);
				System.out.println("found " + found);
				System.out.println("word :" + word);*/
			}
		}
			// sorts the entire array alphabetically
		Collections.sort(ans);
		
		print(ans);
	}
		// creates a temp char array sorts the string and returns it
	public static String sort(String word) {
		char[] tempArray = word.toCharArray();
		
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
		// prints the array
	public static void print(Vector<String> ans) {
		for (int j = 0; j < ans.size(); j++) {
			System.out.println(ans.get(j) + " ");
		}
	}
}
