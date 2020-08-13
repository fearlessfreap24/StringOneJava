//Given a string of even length, return a string made 
//of the middle two chars, so the string "string" yields 
//"ri". The string length will be at least 2.
//
//middleTwo("string") → "ri"
//middleTwo("code") → "od"
//middleTwo("Practice") → "ct"


public class MiddleTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleTwo start = new MiddleTwo();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "string", "code", "Practice", "ab" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, middleTwo(str));
		}
	}

	private String middleTwo(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return str;
		
		return str.substring((str.length()/2) - 1, (str.length()/2 +1));
	}

}
