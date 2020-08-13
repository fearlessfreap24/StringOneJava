//Given a string and a second "word" string, we'll say that the 
//word matches the string if it appears at the front of the string, 
//except its first char does not need to match exactly. On a match, 
//return the front of the string, or otherwise return the empty string. 
//So, so with the string "hippo" the word "hi" returns "hi" and "xip" 
//returns "hip". The word will be at least length 1.
//
//startWord("hippo", "hi") → "hi"
//startWord("hippo", "xip") → "hip"
//startWord("hippo", "i") → "h"


public class StartWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartWord start = new StartWord();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] strs = { {"hippo", "hi"}, {"hippo", "xip"}, {"hippo", "i"} };
		
		for ( String[] str : strs ) {
			System.out.printf("a = %s, b = %s : %s\n", str[0], str[1], startWord(str[0], str[1]));
		}
	}

	private String startWord(String str, String word) {
		if ( word.length() < 2 ) return str.substring(0,1);
		
	}

}
