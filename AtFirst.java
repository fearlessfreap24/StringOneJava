//Given a string, return a string length 2 made of its 
//first 2 chars. If the string length is less than 2, 
//use '@' for the missing chars.
//
//atFirst("hello") → "he"
//atFirst("hi") → "hi"
//atFirst("h") → "h@"


public class AtFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtFirst start = new AtFirst();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "hello", "hi", "h", "" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, atFirst(str));
		}
	}

	private Object atFirst(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 2 ) return String.format("%-2s", str).replace(' ', '@');
		if ( str.length() == 2 ) return str;
		return str.substring(0, 2);
	}

}
