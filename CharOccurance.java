package week2.day2.assignment;

public class CharOccurance {

	public static void main(String[] args) {
	String str = "welcometochennai"	;
	char c ='e';
	System.out.println(c);
	int count = 0;
	for (int i = 0; i < str.length(); i++) {
		if (str.charAt(i) == c) {
			count++;
		}
	}
	System.out.println(count);

}
}
