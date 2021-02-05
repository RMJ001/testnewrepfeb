/**
 * 
 */
package newRJProject;

/**
 * @author rahul
 *
 */
public class testrjclass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String nameString = "The quick brown fox jumped over the lazy dog.";
String [] arraystring = nameString.split(" ");
System.out.println("The total number of words are " + arraystring.length);
for (int j=0;j<arraystring.length;j++) {
	String word = arraystring[j];
	System.out.println("Word " + j + " " + word);
}

	}

}
