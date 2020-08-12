//Given a string, return a "rotated left 2" version where 
//the first 2 chars are moved to the end. The string length 
//will be at least 2.
//
//
//left2("Hello") → "lloHe"
//left2("java") → "vaja"
//left2("Hi") → "Hi"


public class Left2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Left2 start = new Left2();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "java", "Hi" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, left2(str));
		}
	}

	private String left2(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return str;
		
		return str.substring(2) + str.substring(0, 2);
	}

}
