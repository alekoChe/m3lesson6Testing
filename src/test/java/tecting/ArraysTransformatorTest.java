package tecting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

public class ArraysTransformatorTest {
    private static ArraysTransformator transformator;
    private int[] arr = {1, 2, 3, 4, 5, 6};
    private int[] arr2 = {1, 2, 3, 4, 5, 6,7, 8};
    private int[] arr3 = {4, 1, 4, 5, 6, 7 , 8};
    private int[] arr4 = {0, 1, 2, 4, 1, 4, 5, 6, 7 , 8};
    private int[] arr5 = {1, 2, 3};

    @BeforeClass
    public static void init() {
        System.out.println("Init");
        transformator = new ArraysTransformator();
    }

    @Test
    public void transformatorArrayTest() {
        final int[] result = transformator.transformArray(arr);
        Assert.assertArrayEquals(new int[]{5, 6}, result);
    }
    @Test
    public void transformatorArrayTest2() {
        final int[] result = transformator.transformArray(arr2);
        Assert.assertArrayEquals(new int[]{5, 6,7,8}, result);
    }
    @Test
    public void transformatorArrayTest3() {
        /** несколько четверок в массиве */
        final int[] result = transformator.transformArray(arr3);
        Assert.assertArrayEquals(new int[]{5, 6,7,8}, result);
    }
    @Test
    public void transformatorArrayTest4() {
        /** несколько четверок в массиве */
        final int[] result = transformator.transformArray(arr4);
        Assert.assertArrayEquals(new int[]{5, 6,7,8}, result);
    }
    @Test
    public void checkException() {
        /** проверка на выброс исключения если нет четверки в массиве */
        Assertions.assertThrows(Not4Exception.class, () -> {
            transformator.transformArray(arr5);
        });

    }
    //////////////////////////////////

}