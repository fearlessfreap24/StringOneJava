//Given a string, return a version without both the first and 
//last char of the string. The string may be any length, 
//including 0.
//
//withouEnd2("Hello") → "ell"
//withouEnd2("abc") → "b"
//withouEnd2("ab") → ""


public class WithoutEnd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutEnd2 start = new WithoutEnd2();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "abc", "ab" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, withoutEnd2(str));
		}
	}

	private String withoutEnd2(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return "";
		return str.substring(1,str.length() - 1);
	}

}
