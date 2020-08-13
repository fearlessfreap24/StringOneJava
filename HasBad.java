//Given a string, return true if "bad" appears starting 
//at index 0 or 1 in the string, such as with "badxxx" 
//or "xbadxx" but not "xxbadxx". The string may be any 
//length, including 0. Note: use .equals() to compare 2 strings.
//
//hasBad("badxx") → true
//hasBad("xbadxx") → true
//hasBad("xxbadxx") → false


public class HasBad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HasBad start = new HasBad();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "badxx", "xbadxx", "xxbadxx" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %b\n", str, hasBad(str));
		}
	}

	private Object hasBad(String str) {
		// TODO Auto-generated method stub
		return str.indexOf("bad") == 0 || str.indexOf("bad") == 1;
	}

}
