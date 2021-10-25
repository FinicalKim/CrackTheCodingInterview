package CrackingTheCodingInterview;

import java.util.Arrays;

public class Chap1_Check_Permutation {

	public static void main(String[] args) {
		
		String name1 = "kim";
		String name2 = "kim";
		
		System.out.println(checkPermutation(name1, name2));
		System.out.println(permutation(name1, name2));
	}
	
	public static boolean checkPermutation(String str1, String str2) {
		char[] strArray1 = str1.toCharArray();
		char[] strArray2 = str2.toCharArray();
		
			//returns the strings sorted into an array of characters
		Arrays.sort(strArray1);
		Arrays.sort(strArray2);
		
			// if they are not of equal length they cannot be permutations
		if (strArray2.length != strArray1.length) {
			return false;}
		
			// after sorted compare indexs to see if the are equal
		for (int i = 0; i < strArray1.length; i++ ) {
			if (strArray1[i] == strArray2[i])
		return true;
		}
		return false;
		
	}
	
		// Another implementation from the book
	public static boolean permutation(String str1, String str2) {
		if(str1.length() != str2.length()) {
			return false;
		}
		return sort(str1).equals(sort(str2));
	}
	
	public static String sort(String str) {
		char[] content = str.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

}
