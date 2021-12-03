package week2.day2.assignment;

public class Palindrome {

	public static void main(String[] args) {
		String str1 = "madam";
		String str2 = "";
		int len = str1.length();
		for (int i = (len - 1); i >= 0; i--) {
			str2 = str2 + str1.charAt(i);
			
		}
		if (str1.equals(str2)) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("not a palindrome");
		}
		

	}

}
