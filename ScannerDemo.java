/**
 * @author GadewarShubham, MoreAnuja, SowanyVaishnavi
 * 
 */
public class ScannerDemo {

	private static String file1 = ".\\src\\prog2.jay";
	//private static int counter = 1;

	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);

		System.out.println(file1);

		while (!ts.isEndofFile()){
			   Token to = ts.nextToken();
			   System.out.println(to.toString());
			}
	}
}
