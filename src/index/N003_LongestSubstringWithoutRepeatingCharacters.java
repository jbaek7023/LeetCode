package index;

import java.util.HashMap;

/**
 * Duration
 * April 13, 2016
 * Gave Up (REASON: Hashmap)
 */

/**
 * Given "abcabcbb", the answer is "abc", which the length is 3.
 * 
 * Given "bbbbb", the answer is "b", with the length of 1.
 * 
 * Given "pwwkew", the answer is "wke", with the length of 3. Note that the
 * answer must be a substring,
 * 
 * @author jaeminbaek
 * 
 */
public class N003_LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
		System.out.println(lengthOfLongestSubstring("bbbbb"));
		System.out.println(lengthOfLongestSubstring("pwwkew"));
		//answer should be "abc", "b", "wke"
		//answer should be 3 1 3
	}
	
	public static int lengthOfLongestSubstring(String s) {
		if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i) {
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }

}

/**
	When to use HashMap?
	1. No Order (You cannot retrieve the itme of the list 
	2. 
	
*/