//Given a string, return a new string made of 3 copies of 
//the last 2 chars of the original string. The string length 
//will be at least 2.
//
//extraEnd("Hello") → "lololo"
//extraEnd("ab") → "ababab"
//extraEnd("Hi") → "HiHiHi"


public class ExtraEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtraEnd start = new ExtraEnd();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = {"Hello", "ab", "Hi"};
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, extraEnd(str));
		}
	}

	private String extraEnd(String str) {
		// TODO Auto-generated method stub
		String sub = str.substring(str.length()-2);
		return sub + sub + sub;
	}

}
