//Given a string, if the first or last chars are 'x', return 
//the string without those 'x' chars, and otherwise return 
//the string unchanged.
//
//withoutX("xHix") → "Hi"
//withoutX("xHi") → "Hi"
//withoutX("Hxix") → "Hxi"


public class WithoutX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutX start = new WithoutX();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "xHix", "xHi", "Hxix", "xx", "x", "a", "" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, withoutX(str));
		}
	}

	private String withoutX(String str) {
		
		if ( str.contentEquals("x") ) return "";
		if ( str.length() < 2 ) return str;
		if ( str.substring(0, 1).equals("x") ) str = str.substring(1);
		if ( str.substring(str.length() - 1).equals("x") ) str = str.substring(0, str.length() - 1);
		
		return str;
	}

}
