-- Created by Ugur Kartal

class Solution {
    public static String camelCase(String input) {
        StringBuilder sb = new StringBuilder();
        for(char chr : input.toCharArray()){
            sb.append(Character.isUpperCase(chr) ? " " + chr : chr);
        }
        return sb.toString();
    }
}