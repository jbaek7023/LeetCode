package easyStep;
//Input: 5
//Output: 2
//Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

/*TAGS: Bit Manipulation*/
public class E1NumberComplement {
    public int findComplement(int num) {
        //정리, input = 5
        // 101
        // 111 - 101
        // return 111 - num
        
        int i = 0;
        int j = 0;
        
        //num = 5
        while (i < num)
        {
            // i = + 2^0 + 2^1 + 2^2=  7
            i += Math.pow(2, j);
            // j = 2
            j++; // j=3
        }
        
        return i - num; //7 - 5 = 2
        
    }
}

/*
 * 항상 시작전에 어떻게 코딩할지 정리하는 것은 필수다. 어떤 리턴값을 갖을 건지 적어보자.
 * */
// 2^j = Math.pow(2, j);
 