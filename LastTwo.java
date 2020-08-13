//Given a string of any length, return a new string where the 
//last 2 chars, if present, are swapped, so "coding" yields "codign".
//
//lastTwo("coding") → "codign"
//lastTwo("cat") → "cta"
//lastTwo("ab") → "ba"


public class LastTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastTwo start = new LastTwo();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "coding", "cat", "ab" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, lastTwo(str));
		}
	}

	private String lastTwo(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 2 ) return str;
		if ( str.length() == 2 ) return str.substring(1) + str.substring(0, 1);
		
		return str.substring(0, str.length() - 2)
				+ str.substring(str.length() - 1)
				+ str.substring(str.length() - 2, str.length() - 1);
	}

}
