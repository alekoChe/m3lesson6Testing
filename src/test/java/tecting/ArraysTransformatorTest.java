package tecting;

import org.junit.BeforeClass;

import static org.junit.Assert.*;

public class ArraysTransformatorTest {
    private static ArraysTransformator transformator;
    private int[] arr = {1, 2, 3, 4, 5, 6};
    private int[] arr2 = {1, 2, 3, 4, 5, 6,7, 8};
    private int[] arr3 = {4, 1, 4, 5, 6, 7 , 8};
    private int[] arr4 = {0, 1, 2, 4, 1, 4, 5, 6, 7 , 8};

    @BeforeClass
    public static void init() {
        System.out.println("Init");
        transformator = new ArraysTransformator();
    }
}