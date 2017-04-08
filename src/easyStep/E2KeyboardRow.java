package easyStep;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.LinkedList;

//Given a List of words, return the words that can be typed using letters of alphabet 
// on only one row's of American keyboard like the image below.

public class E2KeyboardRow {
	
	public static String[] findWords(String[] words) {
       String[] keyboardString = {"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<keyboardString.length; i++){
        	// keyboardString[0] = "qwertyuiop"
            for(char c: keyboardString[i].toCharArray()){
                map.put(c, i); //put <char, rowIndex> pair into the map
            }
        }
        
        List<String> res = new LinkedList<>();
        // words = {"Hello", "Alaska", "Dad", "Peace"}
        for(String w: words) {
        	int index = map.get(w.toLowerCase().charAt(0));
        	for(char c: w.toLowerCase().toCharArray()){
                if(map.get(c)!=index){
                    index = -1; //don't need a boolean flag. 
                    break;
                }
            }
            if(index!=-1) res.add(w);//if index != -1, this is a valid string
        }
        return res.toArray(new String[0]);
    }
	
	public static void main(String[] args) {
		String[] words = {"Hello", "Alaska", "Dad", "Peace"};
		String[] output = findWords(words);
		for(String o: output) {
			System.out.println(o);
		}
	}
}

// String[] = {}
// Map<Character, Integer> map = new HashMap<>();

//HashMap<Integer, String> hmap = new HashMap<Integer, String>();
//Set set = hmap.entrySet();
//Iterator iterator = set.iterator();
//while(iterator.hasNext()) {
//   Map.Entry mentry = (Map.Entry)iterator.next();
//   System.out.print("key is: "+ mentry.getKey() + " & Value is: ");
//   System.out.println(mentry.getValue());
//}

//Index 저장후, 다른 index가 있으면 break하는 형식! 