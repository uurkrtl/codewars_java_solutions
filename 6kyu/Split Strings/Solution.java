-- Created by Ugur Kartal

public class StringSplit {
    public static String[] solution(String s) {
        int index = 0;
        int length = s.length();
        boolean isEven = length % 2 == 0;
        String[] result = new String[isEven ? length/2 : length/2 + 1];
        for (int i = 0; i<length; i+=2){
            if (!isEven && i == length -1){
                result[index] = s.substring(i) + "_";
            }else {
                result[index] = s.substring(i, i+2);
                index++;
            }
        }
        return result;
    }
}