-- Created by Ugur Kartal

public class NumberUtils {

    public static boolean isNarcissistic(int number) {
        char[] charNumber = String.valueOf(number).toCharArray();
        int digit = charNumber.length;
        int sum = 0;
        for (char chr : charNumber){
            sum += Math.pow(Character.getNumericValue(chr), digit);
        }
        return sum == number;
    }
}