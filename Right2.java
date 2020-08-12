//Given a string, return a "rotated right 2" version where 
//the last 2 chars are moved to the start. The string length
//will be at least 2.
//
//right2("Hello") → "loHel"
//right2("java") → "vaja"
//right2("Hi") → "Hi"


public class Right2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Right2 start = new Right2();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "java", "Hi" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, right2(str));
		}
	}

	private String right2(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return str;
		
		return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
	}

}
