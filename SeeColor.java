//Given a string, if the string begins with "red" or "blue" return 
//that color string, otherwise return the empty string.
//
//seeColor("redxx") → "red"
//seeColor("xxred") → ""
//seeColor("blueTimes") → "blue"


public class SeeColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeeColor start = new SeeColor();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "redxx", "xxred", "blueTimes", "re", "blu" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, seeColor(str));
		}
	}

	private String seeColor(String str) {
		// TODO Auto-generated method stub
		if ( str.length() < 3 ) return "";
		else if ( "red".equals(str.substring(0,3))) return "red";
		else if ( str.length() < 4 ) return "";
		else if ( "blue".equals(str.substring(0, 4))) return "blue";
		
		return "";
	}

}
