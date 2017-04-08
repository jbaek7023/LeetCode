package easyStep;

import java.util.ArrayList;
import java.util.List;

public class E3Fizzbuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> output = new ArrayList<String>();
        for(int i=1; i<=n; i++) {
            if(i%3==0 && i%5==0) {
                output.add("FizzBuzz");
            } else if (i%3==0) {
            	output.add("Fizz");
            } else if (i%5==0) {
            	output.add("Buzz");
            } else {
                output.add(Integer.toString(i));
            }
        }
        return output;
    }
    
    public static void main(String[] args) {
    	List<String> output = fizzBuzz(15);
    	for(String s: output) {
    		System.out.println(s);
    	}
    }
}

// List<String> output = new ArrayList<String>();

/*Convert integer to String*/
//Convert using Integer.toString(int) <<
//Convert using String.valueOf(int)
//Convert using new Integer(int).toString()
