package index;

import java.util.HashMap;
import java.util.Map;

/**
 * Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 * @author jaeminbaek
 *
 */
public class N001_TwoSum {
	public static void main(String[] args) {
		int[] nums = {2, 3, 7, 11, 15};
		int[] output = twoSum(nums, 9);
		for(Integer i: output) {
			System.out.println(i);
		}
	}
	
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
	    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for (int i = 0; i < nums.length; i++) {
	        if (map.containsKey(target - nums[i])) {
	            result[1] = i + 1;
	            result[0] = map.get(target - nums[i]);
	            //result(=0) => 2 
	            //result(=1) => 3 
	            return result; //(3,2)
	        }
	        //target(=9) - nums[i] = 7 
	        //(2, 1), (3, 2), 
	        
	        //putting takes log(n) time
	        map.put(nums[i], i + 1);
	    }
	    return result;
    }
}
