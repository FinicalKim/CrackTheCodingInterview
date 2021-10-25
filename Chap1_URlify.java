package CrackingTheCodingInterview;

public class Chap1_URlify {
	
		// The method to solve this is to work backwards filling in the array
	public static void main(String[] args) {
		
		String str = "Mr John Smith    ";
		char[] content = str.toCharArray();		// converts the string into an array of characters
		int trueLength = 13; 	// the length of the array
		
		System.out.println(replaceSpaces(content, trueLength));
	}
	
	public static void URlify(char[] str, int trueLength) {
		
	}
	
	public static char[] replaceSpaces(char[] str, int trueLength) {
		
		int numberOfSpaces = countOfChar(str, 0, trueLength, ' ');		// find the number of spaces in the string ~ numberOfSpaces == 2
		int newIndex = trueLength - 1 + numberOfSpaces *2;		// newIndex == 13 - 1 + 2(2) = 16
		
		if (newIndex + 1 < str.length) {
			str [newIndex + 1] = '\0';		// sets index equal to null
		}
			// oldIndex == 12
			// newIndex == 16
		for (int oldIndex = trueLength - 1; oldIndex >= 0; oldIndex -= 1) {
			if (str[oldIndex] == ' ') {		// insert %20
				str[newIndex] = '0';
				str[newIndex - 1] = '2';
				str[newIndex - 2] = '%';
				newIndex -= 3;
					// check
				System.out.println(str);
				
			}else {
				str[newIndex] = str[oldIndex];
				newIndex -= 1;
					// check
				System.out.println(str);
				
			}
		}
		return str;
		
	}
	
	public static int countOfChar(char[] str, int start, int end, int target) {
		
		int count = 0;
		for (int i = start; i < end; i++ ) {
			if (str[i] == target){
				count++;
			}
		}
		return count;
	}

}
