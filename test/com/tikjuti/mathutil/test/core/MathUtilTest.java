
package com.tikjuti.mathutil.test.core;

import com.tikjuti.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
//import java.lang.IllegalArgumentException;


public class MathUtilTest {
    
//    TH1: Nhập vào đúng dữ liệu và kiểm tra.
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        Assert.assertEquals(expected, actual);
        
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
//    TH2: Nhập vào dữ liệu âm, hoặc dữ liệu lớn hơn 20.
    @Test (expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException() {
        MathUtil.getFactorial(-5);
    }
    
//    Hoc LAMBDA EXPRESSION
//    Chỉ xảy ra khi chơi vs Interface mà chỉ có duy nhất một hàm Abstract
//    Interface có một hàm duy nhất abstract/Hàm Không có code  đc gọi là Funtional Interface
    
    
//    Vẫn bắt ngoại lệ nhưng dùng biểu thức Lambda
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaVersion() {
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(21)
        );
    }
    
//    Test ngoại lệ bằng cách dùng try-catch
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch() {
        try {
            MathUtil.getFactorial(21);
        } catch (Exception e) {
//            Try catch thì Junit trả về màu xanh do đã chủ động kiểm soát ngoại lệ
//            Nhưng không chắc ngoại lệ mình cần có xuất hiện hay khônge.
//            Cần có đoạn code kiểm tra có đúng ngoại lệ mình cần hay không
              Assert.assertEquals("Invalid of argument. N must between 0...20", e.getMessage());
        }
    }
}
