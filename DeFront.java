//Given a string, return a version without the first 2 chars. 
//Except keep the first char if it is 'a' and keep the second 
//char if it is 'b'. The string may be any length. Harder than 
//it looks.
//
//deFront("Hello") → "llo"
//deFront("java") → "va"
//deFront("away") → "aay"


public class DeFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeFront start = new DeFront();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "java", "away", "ab", "ax" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, deFront(str));
		}
	}

	private String deFront(String str) {
		if ( str.length() == 0 ) return "";
		if ( str.length() == 1 && str.equals("a")) return "a";
		if ( str.length() == 1 ) return "";
		
		String first = str.substring(0,1);
		String second = str.substring(1,2);
		String rest = str.substring(2);
		String defront = "";
		
		if ( first.equals("a") ) defront = defront + first;
		if ( second.contentEquals("b") ) defront = defront + second;
		
		return defront + rest;
	}

}
