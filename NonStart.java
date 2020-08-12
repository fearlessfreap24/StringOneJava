import java.util.Arrays;

//Given 2 strings, return their concatenation, except omit the 
//first char of each. The strings will be at least length 1.
//
//nonStart("Hello", "There") → "ellohere"
//nonStart("java", "code") → "avaode"
//nonStart("shotl", "java") → "hotlava"


public class NonStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonStart start = new NonStart();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] input = { {"Hello", "There"}, {"java", "code"}, {"shotl", "java"} };
		for ( String[] i : input ) {
			System.out.printf("i = %s : %s\n", Arrays.toString(i), nonStart(i[0], i[1]));
		}
	}

	private String nonStart(String a, String b) {
		// TODO Auto-generated method stub
		if ( a.length() < 2 && b.length() < 2 ) return "";
		if ( a.length() < 2 ) return b.substring(1);
		if ( b.length() < 2 ) return a.substring(1);
		
		return a.substring(1) + b.substring(1);
	}

}
