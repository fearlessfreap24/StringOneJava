//Given 2 strings, a and b, return a new string made of the 
//first char of a and the last char of b, so "yo" and "java" 
//yields "ya". If either string is length 0, use '@' for its 
//missing char.
//
//lastChars("last", "chars") → "ls"
//lastChars("yo", "java") → "ya"
//lastChars("hi", "") → "h@"


public class LastChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastChars start = new LastChars();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] strs = { {"last", "chars"}, {"yo", "java"}, {"hi", ""} };
		
		for ( String[] str : strs ) {
			System.out.printf("a = %s, b = %s : %s\n", str[0], str[1], lastChars(str[0], str[1]));
		}
	}

	private String lastChars(String a, String b) {
		// TODO Auto-generated method stub
		if ( a.length() == 0 && b.length() == 0 ) return "@@";
		if ( a.length() == 0 ) return "@" + b.substring(b.length() - 1);
		if ( b.length() == 0 ) return a.substring(0, 1) + "@";
		
		return a.substring(0, 1) + b.substring(b.length() - 1);
	}

}
