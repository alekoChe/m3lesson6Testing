package tecting;

public class Not4Exception extends MyAppException{

    private static final String MSE = "В введенном массиве %h нет числа 4!";

    public Not4Exception(int[] inputArray) {
        super(String.format(MSE, inputArray));
    }
}
