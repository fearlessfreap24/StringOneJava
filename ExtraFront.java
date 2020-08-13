//Given a string, return a new string made of 3 copies of the first 
//2 chars of the original string. The string may be any length. If 
//there are fewer than 2 chars, use whatever is there.
//
//extraFront("Hello") → "HeHeHe"
//extraFront("ab") → "ababab"
//extraFront("H") → "HHH"


public class ExtraFront {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraFront start = new ExtraFront();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "ab", "H" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, extraFront(str));
		}
	}

	private Object extraFront(String str) {
		if ( str.length() < 3 ) return str + str + str;
		else {
			String front = str.substring(0, 2);
			return front + front + front;
		}
	}

}
