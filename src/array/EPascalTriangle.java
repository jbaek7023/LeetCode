package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an index k, return the kth row of the Pascal's triangle.

For example, given k = 3,
Return [1,3,3,1].

Note:
Could you optimize your algorithm to use only O(k) extra space?
 * @author jaemin
 *
 */
public class EPascalTriangle {

	public static List<Integer> getRow(int rowIndex) {
        List<Integer> output = new ArrayList<Integer>();
        if(rowIndex == 1) {
        	output.add(1);
        } 
        if(rowIndex == 2) {
        	output.add(1);
        	output.add(1);
        }
        
        
        return output;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 : 	  1
		//2 :    1 1
		//3 :   1 2 1
		//4:   1 3 3 1
		//5:  1 4 6 4 1
		System.out.println(getRow(1));
	}

}
