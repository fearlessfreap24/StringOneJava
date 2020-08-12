//Given a string of even length, return the first half. 
//So the string "WooHoo" yields "Woo".
//
//firstHalf("WooHoo") → "Woo"
//firstHalf("HelloThere") → "Hello"
//firstHalf("abcdef") → "abc"


public class FirstHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstHalf start = new FirstHalf();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "WooHoo", "HelloThere", "abcdef" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, firstHalf(str));
		}
	}

	private String firstHalf(String str) {
		// TODO Auto-generated method stub
		return str.substring(0,str.length() / 2);
	}

}
