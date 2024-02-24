package csc581;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.add(3,8);
        assertEquals(11, result);
    }
    @Test
    public void testSubtract() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.subtract(7,8);
        assertEquals(-1, result);
        result = mathUtils.subtract(18,8);
        assertEquals(10, result);
    }
    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multiply(6,11);
        assertEquals(66, result);
        result = mathUtils.multiply(6,0);
        assertEquals(0, result);        
    }
    @Test
    public void testDivide() {
        MathUtils mathUtils = new MathUtils();
        double result = mathUtils.divide(21,3);
        assertEquals(7, result, 0);
        result = mathUtils.divide(21, 0);
        assertEquals(-1.0, result, 0);
    }
}
