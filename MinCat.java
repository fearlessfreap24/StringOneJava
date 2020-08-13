//Given two strings, append them together (known as "concatenation") 
//and return the result. However, if the strings are different lengths, 
//omit chars from the longer string so it is the same length as the 
//shorter string. So "Hello" and "Hi" yield "loHi". The strings may be 
//any length.
//
//minCat("Hello", "Hi") → "loHi"
//minCat("Hello", "java") → "ellojava"
//minCat("java", "Hello") → "javaello"


public class MinCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinCat start = new MinCat();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] strs = { {"Hello", "Hi"}, {"Hello", "java"}, {"java", "Hello"} };
		
		for ( String[] str : strs ) {
			System.out.printf("a = %s, b = %s : %s\n", str[0], str[1], mincat(str[0], str[1]));
		}
	}

	private String mincat(String a, String b) {
		int lenA = a.length();
		int lenB = b.length();
		
		if ( lenA < lenB ) return a + b.substring(b.length() - lenA);
		if ( lenB < lenA ) return a.substring(a.length() - lenB) + b;
		
		return a + b;
	}

}
