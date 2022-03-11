package week3.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String text1 = "madam";
		String rev = "";
		int length = text1.length();
		System.out.println(length);
		for (int i = length-1; i >= 0; i--) {
			char charAt = text1.charAt(i);		
			rev = rev + charAt;
		}
			if (text1.equals(rev)) {
				System.out.println("The given word is a palindrome");
			}
			else {
				System.out.println("The given word is not a palindrome");

			}
		
		}

	}
