package tecting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfOnesAndFours {

    public static void main(String[] args) {
        final int[] inputArray1 = new int[]{1, 1, 1};
        final int[] inputArray2 = new int[]{4};
        final int[] inputArray3 = new int[]{1, 4, 1};
        final int[] inputArray4 = new int[]{1, 4, 1, 4, 5};

        ArrayOfOnesAndFours oOF = new ArrayOfOnesAndFours();

        System.out.println(oOF.checkIsOnly1And4InArray(inputArray1));
        System.out.println(oOF.checkIsOnly1And4InArray(inputArray2));
        System.out.println(oOF.checkIsOnly1And4InArray(inputArray3));
        System.out.println(oOF.checkIsOnly1And4InArray(inputArray4));
    }

    public boolean checkIsOnly1And4InArray(int[] inputArray) {
        boolean numbersAreOnly1And4 = false;
        boolean otherNumbers = false;
        boolean is1 = false;
        boolean is4 = false;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] != 1 && inputArray[i] != 4) {
                otherNumbers = true;
                break;
            }
            if (inputArray[i] == 1) {
                is1 = true;
            }
            if (inputArray[i] == 4) {
                is4 = true;
            }
        }
        if (otherNumbers == false && is1 == true && is4 == true) {
            numbersAreOnly1And4 = true;
        }
        return numbersAreOnly1And4;
    }
}
