package tecting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
@RunWith(value = Parameterized.class)
public class ArrayOfOnesAndFoursTest {

    private static ArrayOfOnesAndFours arrOnesAndFours;

    private int[] inputArr;
    private boolean expectedResult;

    public ArrayOfOnesAndFoursTest(int[] inputArr, boolean result) {
        this.inputArr = inputArr;
        this.expectedResult = expectedResult;
    }
    @BeforeClass
    public static void init() {
        System.out.println("Init");
        arrOnesAndFours = new ArrayOfOnesAndFours();
    }
    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {new  int[]{1, 2, 3, 4, 5, 6}, false},
                {new  int[]{4, 1, 4, 4, 1},true},
                {new  int[]{4, 4, 4, 4, 4}, false},
                {new  int[]{ 1}, false},
                {new  int[]{ 4}, false},
                {new  int[]{ 1, 1, 1, 1, 1}, false},
                {new  int[]{ 1, 4}, true}
        });
    }
    @Test
    public void arrayOfOnesAndFoursTest() {
        final boolean result = arrOnesAndFours.checkIsOnly1And4InArray(inputArr);
        Assert.assertEquals(expectedResult, result);
    }
}