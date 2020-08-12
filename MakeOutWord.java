import java.util.Arrays;

//Given an "out" string length 4, such as "<<>>", and a word, 
//return a new string where the word is in the middle of the 
//out string, e.g. "<<word>>". Note: use str.substring(i, j) 
//to extract the String starting at index i and going up to but 
//not including index j.
//
//makeOutWord("<<>>", "Yay") → "<<Yay>>"
//makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
//makeOutWord("[[]]", "word") → "[[word]]"


public class MakeOutWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeOutWord start = new MakeOutWord();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] input = { {"<<>>", "Yay"}, {"<<>>", "WooHoo"}, {"[[]]", "word"} };
		for ( String[] i : input ) {
			System.out.printf("i = %s : %s\n", Arrays.toString(i), makeOutWord(i[0], i[1]));
		}
	}

	private String makeOutWord(String out, String word) {
		// TODO Auto-generated method stub
		String front = out.substring(0, 2);
		String back = out.substring(2);
		return front+word+back;
	}

}
