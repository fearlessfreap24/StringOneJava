//Given a string, return a string length 1 from its front, 
//unless front is false, in which case return a string length 
//1 from its back. The string will be non-empty.
//
//theEnd("Hello", true) → "H"
//theEnd("Hello", false) → "o"
//theEnd("oh", true) → "o"


public class TheEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TheEnd start = new TheEnd();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "Hello", "oh" };
		boolean[] bools = { true, false, true };
		
		for ( int i = 0; i < strs.length; i++ ) {
			System.out.printf("str = %s, front = %b : %s\n", strs[i], bools[i], theEnd(strs[i], bools[i]));
		}
	}

	private String theEnd(String str, boolean front) {
		// TODO Auto-generated method stub
		if ( str.length() == 1 ) return str;
		if ( front ) return str.substring(0, 1);
		else return str.substring(str.length() - 1);
	}

}
