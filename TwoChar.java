//Given a string and an index, return a string length 2 
//starting at the given index. If the index is too big 
//or too small to define a string length 2, use the first 
//2 chars. The string length will be at least 2.
//
//twoChar("java", 0) → "ja"
//twoChar("java", 2) → "va"
//twoChar("java", 3) → "ja"


public class TwoChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoChar start = new TwoChar();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] str = { "java", "java", "java", "java" };
		int[] nums = { 0, 2, 3, -1 };
		
		for ( int i = 0; i < str.length; i++ ) {
			System.out.printf("str = %s, n = %d : %s\n", str[i], nums[i], twoChar(str[i], nums[i]));
		}
	}

	private String twoChar(String str, int index) {
		// TODO Auto-generated method stub
		if ( index > str.length() - 2 || index < 0 ) return str.substring(0, 2);
		
		return str.substring(index, index+2);
	}

}
