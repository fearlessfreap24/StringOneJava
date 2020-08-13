//Given a string and an int n, return a string made of the 
//first and last n chars from the string. The string length 
//will be at least n.
//
//nTwice("Hello", 2) → "Helo"
//nTwice("Chocolate", 3) → "Choate"
//nTwice("Chocolate", 1) → "Ce"


public class NTwice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NTwice start = new NTwice();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "Chocolate", "Chocolate", "he" };
		int[] nums = { 2, 3, 1, 2 };
		for ( int i = 0; i < strs.length; i++ ) {
			System.out.printf("str = %s num = %d : %s\n", strs[i], nums[i], nTwice( strs[i], nums[i]));
		}
	}

	private Object nTwice(String str, int n) {
		// TODO Auto-generated method stub
		
		// this didn't work in this class on "he", but it did pass on CodingBat
		return str.substring( 0, n ) + str.substring( str.length() - n );
	}

}
