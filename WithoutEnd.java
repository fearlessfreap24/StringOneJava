//Given a string, return a version without the first and last char, 
//so "Hello" yields "ell". The string length will be at least 2.
//
//withoutEnd("Hello") → "ell"
//withoutEnd("java") → "av"
//withoutEnd("coding") → "odin"


public class WithoutEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutEnd start = new WithoutEnd();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Hello", "java", "coding" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, withoutEnd(str));
		}
	}

	private String withoutEnd(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return "";
		else {
			return str.substring(1,str.length() - 1);
		}
	}

}
