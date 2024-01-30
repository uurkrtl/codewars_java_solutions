-- Created by Ugur Kartal

class Persist {
    public static int persistence(long n) {
        int result = 0;
        int temp = (int) n;
        if (n > 9) {
            while (true){
                n = temp;
                temp = 1;
                for (char chr : String.valueOf(n).toCharArray()){
                    temp *= Character.getNumericValue(chr);

                }
                result++;
                if (temp<10){
                    break;
                }
            }
        }
        return result;
    }
}