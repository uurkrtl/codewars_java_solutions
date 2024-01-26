-- Created by Ugur Kartal

public class Accumul {

    public static String accum(String s) {
        StringBuilder newWord = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            for(int j = 1; j<=(i+1); j++){
                newWord.append(j == 1 ? s.substring(i, i+1).toUpperCase() : s.substring(i, i+1).toLowerCase());
            }
            if(i != s.length()-1){
                newWord.append("-");
            }
        }
        return newWord.toString();
    }
}