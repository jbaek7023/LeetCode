package array;
/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?
 * @author jaemin
 *
 */
public class EMissingNumber {
	/**
	 * n(n+1)/2 = sum. sum - sum of array = missing number
	 * @param nums
	 * @return
	 */
	public static int missingNumber(int[] nums) {
		int sum = 0;
        for(int num: nums)
            sum += num;
            
        return (nums.length * (nums.length + 1) )/ 2 - sum;
    }
	
	public static void main(String[] args) {
		int[] nums = {0, 2, 3, 4};
		System.out.println(missingNumber(nums));
	}
}

/*
 * 수학공식을 활용해*/