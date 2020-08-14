//Given a string, if one or both of the first 2 chars is 'x', 
//return the string without those 'x' chars, and otherwise 
//return the string unchanged. This is a little harder than 
//it looks.
//
//withoutX2("xHi") → "Hi"
//withoutX2("Hxi") → "Hi"
//withoutX2("Hi") → "Hi"


public class WithoutX2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WithoutX2 start = new WithoutX2();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[] strs = { "xHi", "Hxi", "Hi" };
		
		for ( String str : strs ) {
			System.out.printf("str = %s : %s\n", str, withoutX2(str));
		}
	}

	private String withoutX2(String str) {

		String[] splitStr = str.split("");
		String withoutx2 = "";
		for ( int i = 0; i < splitStr.length; i++ ) {
			if ( ( i == 0 
					|| i == 1 ) 
					&& splitStr[i].contentEquals("x") ) { continue; }
			else {
				withoutx2 = withoutx2 + splitStr[i];
			}
		}
		
		return withoutx2;
	}

}
