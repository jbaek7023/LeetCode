package basic;
/*TAGS: Bit Manipulation, hash Table*/

// Given an array of integers, every element appears twice except for one. Find that single one.
public class E4SingleNumber {
	public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i : nums) {
            result ^= i;
        }
        return result;
    }
	
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
		System.out.println(singleNumber(nums));
	}
}

// result ^ i = XOR(result and i)
// X when or. 다를때 1


//first , we have to know the bitwise XOR in java
//
//0 ^ N = N
//N ^ N = 0
//So..... if N is the single number
//
//N1 ^ N1 ^ N2 ^ N2 ^..............^ Nx ^ Nx ^ N
//
//= (N1^N1) ^ (N2^N2) ^..............^ (Nx^Nx) ^ N
//
//= 0 ^ 0 ^ ..........^ 0 ^ N
//
//= N
