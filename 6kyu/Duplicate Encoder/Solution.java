-- Created by Ugur Kartal

import java.util.*;

public class DuplicateEncoder {
    static String encode(String word){
        StringBuilder result = new StringBuilder();
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char chr : word.toLowerCase().toCharArray()){
            characterMap.put(chr, characterMap.containsKey(chr) ? characterMap.get(chr) + 1 : 1);
        }

        for (char chr : word.toLowerCase().toCharArray()){
            result.append(characterMap.get(chr)>1 ? ")" : "(");
        }

        return result.toString();
    }
}