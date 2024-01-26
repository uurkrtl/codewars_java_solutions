-- Created by Ugur Kartal

import java.lang.StringBuilder;
class Solution{

    static String toCamelCase(String s){
        String camelCase = "";
        boolean isHyphen = false;
        for (int i = 0; i<s.length(); i++){
            if(s.charAt(i) == '_' || s.charAt(i) == '-'){
                isHyphen = true;
            }else {
                if(!isHyphen && camelCase == ""){
                    camelCase += s.substring(i,i+1);
                }else if(isHyphen){
                    camelCase += s.substring(i,i+1).toUpperCase();
                }else{
                    camelCase += s.substring(i,i+1).toLowerCase();
                }
                isHyphen = false;
            }
        }
        return camelCase;
    }
}