import java.util.Arrays;

//Given 2 strings, a and b, return a string of the form 
//short+long+short, with the shorter string on the outside 
//and the longer string on the inside. The strings will not 
//be the same length, but they may be empty (length 0).
//
//
//comboString("Hello", "hi") → "hiHellohi"
//comboString("hi", "Hello") → "hiHellohi"
//comboString("aaa", "b") → "baaab"


public class ComboString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ComboString start = new ComboString();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] strs = { {"Hello", "hi"}, {"hi", "Hello"}, {"aaa", "b"} };
		for ( String[] str : strs ) {
			System.out.printf("str = %s : %s\n", Arrays.toString(str), comboString(str[0], str[1]));
		}
	}

	private String comboString(String a, String b) {
		// TODO Auto-generated method stub
		if ( a.length() < b.length() ) {
			return a + b + a;
		}
		
		return b + a + b;
	}

}
