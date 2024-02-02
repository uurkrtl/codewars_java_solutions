-- Created by Ugur Kartal

public class PigLatin {
    public static String pigIt(String str) {
        StringBuilder sb = new StringBuilder();
        String[] strArr = str.split(" ");
        for (String word : strArr){
            if (Character.isLetter(word.charAt(0))){
                sb.append(word.substring(1, word.length())).append(word.substring(0,1)).append("ay ");
            }else {
                sb.append(word).append(" ");
            }
        }
        if (sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
        }
        return sb.toString();
    }
}