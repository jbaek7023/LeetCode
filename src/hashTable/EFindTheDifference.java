package hashTable;

/**
 * Input:
s = "abcd"
t = "abcde"

Output:
e

 * @author jaemin
 *
 */
public class EFindTheDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcd";
		String t = "abcde";
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {
        // Initialize variables to store sum of ASCII codes for 
        // each string
        int charCodeS = 0, charCodeT = 0;
        // Iterate through both strings and char codes
        for (int i = 0; i < s.length(); ++i) charCodeS += (int)s.charAt(i);
        for (int i = 0; i < t.length(); ++i) charCodeT += (int)t.charAt(i);
        // Return the difference between 2 strings as char
        return (char)(charCodeT - charCodeS);
    }
}

/**
 *Char can be integer!
 *
 **/
