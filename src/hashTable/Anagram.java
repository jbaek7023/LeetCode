package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**Need REVIEW*/

/**
 * Given a string s and a non-empty string p, find all the start indices of p's
 * anagrams in s.
 * 
 * Strings consists of lowercase English letters only and the length of both
 * strings s and p will not be larger than 20,100.
 * 
 * The order of output does not matter.
 * 
 * @author jaeminbaek
 * 
 */
public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> output = findAnagrams("asdgnbglldsa", "asd");
		for (Integer i : output) {
			System.out.println(i);
		}
	}

	/**
	 * Sliding Window Solution
	 * 
	 * @param s
	 * @param p
	 * @return
	 */
	public static List<Integer> findAnagrams(String s, String p) {
		List<Integer> list = new ArrayList<Integer>();
		if (s == null || s.length() == 0 || p == null || p.length() == 0)
			return list;
		int[] hash = new int[256]; // character hash //8 bit character.
		//hash = {0, 0,0 ,0, 0, 0,0,0,0,0,0,0,0,0}
		
		// record each character in p to hash
		for (char c : p.toCharArray()) {
			hash[c]++;
		}

		// two points, initialize count to p's length
		int left = 0, right = 0, count = p.length();
		//s = "abcdefcba", p = "abc"
		while (right < s.length()) {
			//hash = {abc}
			
	        //move right everytime, if the character exists in p's hash, decrease the count
	        //current hash value >= 1 means the character is existing in p
	        if (hash[s.charAt(right)] >= 1) {
	            count--;
	        }
//	        System.out.println(hash[s.charAt(right)]);
	        hash[s.charAt(right)]--;
	        right++;
	        
	        //when the count is down to 0, means we found the right anagram
	        //then add window's left to result list
	        if (count == 0) {
	            list.add(left);
	        }
	        //if we find the window's size equals to p, then we have to move left (narrow the window) to find the new match window
	        //++ to reset the hash because we kicked out the left
	        //only increase the count if the character is in p
	        //the count >= 0 indicate it was original in the hash, cuz it won't go below 0
	        if (right - left == p.length() ) {
	           
	            if (hash[s.charAt(left)] >= 0) {
	                count++;
	            }
	            hash[s.charAt(left)]++;
	            left++;
	        
	        }
	    }
		return list;
	}

}
