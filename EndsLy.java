//Given a string, return true if it ends in "ly".
//
//endsLy("oddly") → true
//endsLy("y") → false
//endsLy("oddy") → false


public class EndsLy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EndsLy start = new EndsLy();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "oddly", "y", "oddy" };
		for ( String str : strs ) {
			System.out.printf("str = %s : %b\n", str, endsLy(str));
		}
	}

	private boolean endsLy(String str) {
		// TODO Auto-generated method stub
		return str.endsWith("ly");
	}

}
