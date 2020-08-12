//Given a string, return the string made of its first two chars, 
//so the String "Hello" yields "He". If the string is shorter 
//than length 2, return whatever there is, so "X" yields "X", and 
//the empty string "" yields the empty string "". Note that 
//str.length() returns the length of a string.
//
//firstTwo("Hello") → "He"
//firstTwo("abcdefg") → "ab"
//firstTwo("ab") → "ab"


public class FirstTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstTwo start = new FirstTwo();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "abcdefg", "ab", "a", "" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, firstTwo(str));
		}
	}

	private String firstTwo(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 2 ) return str;
		else return str.substring(0, 2);
	}

}
