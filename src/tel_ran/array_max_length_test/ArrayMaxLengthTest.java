package tel_ran.array_max_length_test;

import org.junit.Test;
import tel_ran.array_max_length.controller.ArrayMaxLengthAppl;

public class ArrayMaxLengthTest {
    @Test(expected = OutOfMemoryError.class)
    public void maxlenghthTest(){
        int maxArrayLenght=ArrayMaxLengthAppl.maxLenght();
        int[] arr=new int[maxArrayLenght+1];
    }

}
