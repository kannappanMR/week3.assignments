package week3.day2;

public class CharOccurance {

	public static void main(String[] args) {
String str = "welcome to chennai";  
char c='e';
int number = 0;

int length = str.length();
for (int i = 0; i < length; i++) {
char charAt = str.charAt(i);	
	if(c == charAt) 
		number++;

	}
System.out.println(number);

}
}
