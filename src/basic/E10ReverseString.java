package basic;
//Given s = "hello", return "olleh"
//TAGS: String, Two Pointers
public class E10ReverseString {

	public static String reverseString(String s) {
        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() -1;
        
        while(j > i) {
        	char tempChar = word[i];
        	word[i] = word[j];
        	word[j] = tempChar;
        	j--;
        	i++;
        }
        return new String(word);
    }
	public static void main(String[] args) {
		String s= "hello";
		System.out.println(reverseString(s));
	}

}

/*Test애소는 Char At을 못씀.*/

// Char[] to String
// new String(s.toCharArray())


