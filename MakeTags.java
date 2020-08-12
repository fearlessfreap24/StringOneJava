import java.util.Arrays;

//The web is built with HTML strings like "<i>Yay</i>" which draws 
//Yay as italic text. In this example, the "i" tag makes <i> and 
//</i> which surround the word "Yay". Given tag and word strings, 
//create the HTML string with tags around the word, e.g. "<i>Yay</i>".
//
//makeTags("i", "Yay") → "<i>Yay</i>"
//makeTags("i", "Hello") → "<i>Hello</i>"
//makeTags("cite", "Yay") → "<cite>Yay</cite>"


public class MakeTags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MakeTags start = new MakeTags();
		start.run();
	}

	private void run() {
		// TODO Auto-generated method stub
		String[][] input = { {"i", "Yay"}, {"i", "Hello"}, {"cite", "Yay"} };
		
		for ( String[] i : input ) {
			System.out.printf("i = %s : %s\n", Arrays.toString(i), makeTags( i[0], i[1]));
		}
	}

	private String makeTags(String tag, String word) {
		// TODO Auto-generated method stub
		return String.format("<%s>%s</%s>", tag, word, tag);
	}

}
