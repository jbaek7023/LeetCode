package easyStep;

import java.util.List;
import java.util.ArrayList;

//Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
//
//Find all the elements of [1, n] inclusive that do not appear in this array.
//
//Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

/*TAGS: Array */
public class E5FindAllNumbersDisappearedInAnArray {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	// {1, 4, 3, 3}
            int val = Math.abs(nums[i]) - 1;
            // val = 3
            if(nums[val] > 0) {
                nums[val] = -nums[val];
                // {-1, 4, -3, -3}
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;
	}

	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> output = findDisappearedNumbers(nums);
		for (int i : output) {
			System.out.println(i);
		}
	}
}
/*index 가 integer이고 값도 integer이므로 어떤 수가 맞을지 num[]안에서 계산함으로 efficient하다.! extra space 없이하라 = num[]안에서 하라.*/

// ctrl + shift f : format
// [].indexOf

// Solution
/*
		List<Integer> ret = new ArrayList<Integer>();
        
        for(int i = 0; i < nums.length; i++) {
        	// {1, 4, 3, 3}
            int val = Math.abs(nums[i]) - 1;
            // val = 3
            if(nums[val] > 0) {
                nums[val] = -nums[val];
                // {-1, 4, -3, -3}
            }
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ret.add(i+1);
            }
        }
        return ret;

*/

//Mine (Low Efficiency)
/*
List<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			output.add(i+1);
		}
		
		for (int i = 0; i < nums.length; i++) {
			//output = {1, 2, 3, 4, 5, 6, 7, 8}
			int index = output.indexOf(nums[i]);
			if(index != -1) {
				output.remove(index);
			}
			
		}
		return output;


*/