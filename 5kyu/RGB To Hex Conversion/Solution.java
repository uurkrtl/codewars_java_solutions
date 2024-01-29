-- Created by Ugur Kartal

public class RgbToHex {

    public static String rgb(int r, int g, int b) {
        StringBuilder result = new StringBuilder();
        int[] nums = new int[]{r, g, b};
        for(int num : nums){
            String hex = num<0 ? "0" : Integer.toHexString(num);
            if(hex.length()==1){
                result.append(0).append(hex);
            }else if (hex.length()>2) {
                result.append("FF");
            }else {
                result.append(hex);
            }
        }
        return result.toString().toUpperCase();
    }
}