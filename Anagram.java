package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "posts";
		String text2 = "topss";
		int length1 = text1.length();
		int length2 = text2.length();
		if (length1 != length2) {
			System.out.println("The Given Word is not Anagram");
		}
		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();

		Arrays.sort(charArray1);
		for (int i = 0; i < charArray1.length; i++) {
			System.out.println(charArray1[i]);
		}
		Arrays.sort(charArray2);
		for (int j = 0; j < charArray2.length; j++) {
			System.out.println(charArray2[j]);
		}
		boolean equals = Arrays.equals(charArray1, charArray2);
		if (equals) {
			System.out.println("The Given Word is Anagram");
		} else {
			System.out.println("The Given Word is not Anagram");

		}
	}

}
