//Given two strings, append them together (known as "concatenation") 
//and return the result. However, if the concatenation creates a double-char, 
//then omit one of the chars, so "abc" and "cat" yields "abcat".
//
//conCat("abc", "cat") → "abcat"
//conCat("dog", "cat") → "dogcat"
//conCat("abc", "") → "abc"


public class ConCat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConCat start = new ConCat();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] strs = { {"abc", "cat"}, {"dog", "cat"}, {"abc", ""} };
		for ( String[] str : strs ) {
			System.out.printf("a = %s, b = %s : %s\n", str[0], str[1], conCat(str[0], str[1]));
		}
	}

	private String conCat(String a, String b) {
		// TODO Auto-generated method stub
		if ( a.length() == 0 ) return b;
		if ( b.length() == 0 ) return a;
		if ( a.substring(a.length()-1).equals(b.substring(0, 1))) {
			return a + b.substring(1);
		}
		return a + b;
	}

}
