//Given a string, return true if the first 2 chars in the 
//string also appear at the end of the string, such as with 
//"edited".
//
//frontAgain("edited") → true
//frontAgain("edit") → false
//frontAgain("ed") → true


public class FrontAgain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FrontAgain start = new FrontAgain();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "edited", "edit", "ed" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %b\n", str, frontAgain(str));
		}
	}

	private boolean frontAgain(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 2 ) return false;
		
		return str.subSequence(0, 2).equals(str.substring(str.length() - 2));
	}

}
