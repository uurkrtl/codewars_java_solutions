-- Created by Ugur Kartal

import java.util.Map;
import java.util.HashMap;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();
        if(str == ""){
            return new HashMap<>();
        }else{
            for (char chr : str.toCharArray()){
                result.put(chr, result.containsKey(chr) ? result.get(chr) + 1 : 1);
            }
        }
        return result;
    }
}