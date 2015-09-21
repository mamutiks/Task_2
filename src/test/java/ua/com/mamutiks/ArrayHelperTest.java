package ua.com.mamutiks;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 9/21/15.
 */
public class ArrayHelperTest {

    @Test
    public void testLeftUnion() throws Exception {
        // initialize variable inputs
        int[] leftArray = {3,6,2,4};
        int[] rightArray = {3,6,2,4,1};

        int[] expectedValue = {3,6,2,4,3,6,2,4};

        //initialize mocks
        //initialize class to test

        ArrayHelper testClass = new ArrayHelper();

        //invoke method on class to test
        int[] returnValue = testClass.leftUnion(leftArray, rightArray);

        //assert mock expectations
        Assert.assertArrayEquals(expectedValue, returnValue);

    }
}