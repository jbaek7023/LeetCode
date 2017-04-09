package basic;

//TAGS: Bit Manipulation
//Given two integers x and y, calculate the Hamming distance.
public class E9HammingDistance {
	public static void main(String[] args) {
		System.out.println(hammingDistance(5,3));
	}

	
	public static int hammingDistance(int x, int y) {
		int xor = x ^ y; //0101
		int count = 0;
	    for (int i=0;i<32;i++) 
	    	count += (xor >> i) & 1;
	    // how many difference? 
	    
	   
	    return count;
    }
}

//Hamming Distance is how many different bits between two integers. 