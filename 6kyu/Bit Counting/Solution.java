-- Created by Ugur Kartal

public class BitCounting {

    public static int countBits(int n){
        int sum = 0;
        String stringBinary = Integer.toBinaryString(n);
        for (int i = 0; i<stringBinary.length(); i++){
            sum += Character.getNumericValue(stringBinary.charAt(i));
        }
        return sum;
    }
}