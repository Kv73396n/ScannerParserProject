/**
 * @author Christelle
 * 
 */
// Completed by Ashley Vargas and Karina Vargas CS 361

public class ScannerDemo {

	private static String file1 = "C:\\Users\\Kwindom\\Downloads\\ParserScannerOriginal(1)\\ParserScannerOriginal\\src\\test.jay.txt"; // change to my address
	private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()) {
			// TO BE COMPLETEDs
			Token t = new Token();
			t = ts.nextToken();
			t.toString();
			System.out.println("Token " + t + "Type: " + t.getType() + "Value: " + t.getValue());
		}
	}
}
