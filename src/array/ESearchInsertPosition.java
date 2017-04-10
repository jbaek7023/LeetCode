package array;

//Given a sorted array and a target value, 
//return the index if the target is found. If not, 
//return the index where it would be if it were inserted in order.
public class ESearchInsertPosition {
	public static int searchInsert(int[] nums, int target) {
		int index = -1;
		for(int i=0; i<nums.length; i++) {
			//1, 3, 5, 6 target 2. 
			//target 2 > 1
			if(target <= nums[i]) {
				index=i;
				break;
			}
		}
		if(index<0) {
			index = nums.length;
		}
		
        return index;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,3,5,6};
		System.out.println(searchInsert(array, 5));//2
		System.out.println(searchInsert(array, 2));//1
		System.out.println(searchInsert(array, 7));//4
		System.out.println(searchInsert(array, 0));//0
	}

}
