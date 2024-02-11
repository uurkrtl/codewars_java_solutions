-- Created by Ugur Kartal

public class Kata
{
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int number : n){
            sum += Math.pow(number, 2);
        }
        return sum;
    }
}