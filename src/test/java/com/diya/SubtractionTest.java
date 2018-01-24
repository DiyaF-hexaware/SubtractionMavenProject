package com.diya;
import com.diya.Subtraction;
import org.junit.Test;
public class SubtractionTest{
    @Test
    public void testSub() {
         int a,b, res;
        Subtraction s = new Subtraction();
        res = s.sub(5,2);
        System.out.println("Result = " + res );
    }
}