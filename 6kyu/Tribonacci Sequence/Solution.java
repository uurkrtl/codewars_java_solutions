-- Created by Ugur Kartal

import java.util.*;

public class Xbonacci {

    public double[] tribonacci(double[] s, int n) {
        double[] result = Arrays.copyOf(s, n);
        for (int i = s.length-1; i<n-1; i++){
            double tempSum = result[i-2] + result[i-1] + result[i];
            result[i+1] = tempSum;
        }
        return result;
    }
}