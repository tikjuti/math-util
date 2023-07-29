
package com.tikjuti.mathutil.core;


public class MathUtil {
    
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid of argument. N must between 0...20");
        if (n == 0 || n == 1)
            return 1;
        
        return n*getFactorial(n-1);
    }
}
