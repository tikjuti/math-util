
package com.tikjuti.mathutil.test.core;

import com.tikjuti.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

// câu lệnh này của Junit báo hiệu cần loop qua tập data để lấy các cặp Input| Expected 
// nhồi vào hàm test.
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
//    ta sẽ trả về mảng 2 chiều chữa các cặp expected và input
    @Parameterized.Parameters
    public static Object[][] initData() {
        return new Integer[][] {
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},
        };
    }
    
    @Parameterized.Parameter(value = 0)
    public int n;
    
    @Parameterized.Parameter(value = 1)
    public long expected;
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
         Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }
}
