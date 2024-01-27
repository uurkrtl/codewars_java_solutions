-- Created by Ugur Kartal

public class XO {

    public static boolean getXO (String str) {
        int xo = 0;
        for(char chr : str.toLowerCase().toCharArray()){
            if(chr == 'x'){
                xo++;
            } else if (chr == 'o') {
                xo--;
            }
        }
        return xo == 0;
    }
}