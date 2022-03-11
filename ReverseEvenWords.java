package week3.day2;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
          String rev = "";
		String[] split = test.split(" ");
		for (String str : split) {
			if (str.length() % 2 == 0) {
				char[] charArray = str.toCharArray();
				for (int i = charArray.length-1; i >=0 ; i--) {
					rev = charArray[i]+rev;
					System.out.println(rev);
			}
			
	
}
		}
	}
}
