package tecting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
@RunWith(value = Parameterized.class)
class ArraysTransformatorTest2 {

    private static ArraysTransformator transformator;
    private int[] inputArr;
    private int[] resultArr;

    public ArraysTransformatorTest2(int[] inputArr, int[] resultArr) {
        this.inputArr = inputArr;
        this.resultArr = resultArr;
    }

    @BeforeAll
    public static void init() {
        System.out.println("Init");
        transformator = new ArraysTransformator();
    }

    @Parameterized.Parameters
    public static Collection data() {
        return Arrays.asList(new Object[][] {
                {new int[] {1, 2, 3, 4, 5, 6}, new int[] {5, 6}},
                {new int[] {1, 2, 3, 4, 5, 6,7, 8}, new int[] {5, 6,7,8}},
                {new int[] {4, 1, 4, 5, 6, 7 , 8}, new int[] {5, 6,7,8}},
                {new int[] {0, 1, 2, 4, 1, 4, 5, 6, 7 , 8}, new int[] {5, 6,7,8}}
        });
    }

    @Test
    public void transformatorArrayTest2(int[] inputArr, int[] resultArr) {
        final int[] result = transformator.transformArray(inputArr);
        Assert.assertArrayEquals(resultArr, result);
    }
}