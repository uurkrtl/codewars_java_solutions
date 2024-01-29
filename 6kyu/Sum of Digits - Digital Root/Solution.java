-- Created by Ugur Kartal

public class DRoot {
    public static int digital_root(int n) {
        String input = String.valueOf(n);
        int sum = 0;
        while (true){
            if (input.length() == 1){
                break;
            }else {
                sum = 0;
                for (char chr : input.toCharArray()){
                    sum += Character.getNumericValue(chr);
                }
                input = String.valueOf(sum);
            }
        }
        return sum;
    }
}