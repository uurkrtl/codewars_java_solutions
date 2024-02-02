-- Created by Ugur Kartal

public class ASum {

    public static long findNb(long m) {
        long sum = 0;
        long n = 1;
        while (sum < m){
            sum += (long) Math.pow(n, 3);
            if (sum == m){
                return n;
            }
            if (n == 53870){
                n = n;
            }
            n++;
        }
        return  -1;
    }
}