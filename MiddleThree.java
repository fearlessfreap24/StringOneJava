//Given a string of odd length, return the string length 
//3 from its middle, so "Candy" yields "and". The string 
//length will be at least 3.
//
//middleThree("Candy") → "and"
//middleThree("and") → "and"
//middleThree("solving") → "lvi"


public class MiddleThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiddleThree start = new MiddleThree();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "Candy", "and", "solving" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, middleThree(str));
		}
	}

	private Object middleThree(String str) {
		// TODO Auto-generated method stub
		if ( str.length() == 3 ) return str;
		
		return str.substring((str.length()/2)-1, (str.length()/2+2));
	}

}
