-- Created by Ugur Kartal

public class DigPow {

    public static long digPow(int n, int p) {
        long sum = 0;
        for (char chr : String.valueOf(n).toCharArray()){
            sum += Math.pow(Character.getNumericValue(chr), p);
            p++;
        }
        return sum % n == 0 ? sum / n : -1;
    }
}