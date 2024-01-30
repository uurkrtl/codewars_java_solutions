-- Created by Ugur Kartal

import java.util.*;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        int result = 0;
        Map<Character, Integer> characterMap = new HashMap<>();
        for (char chr : text.toLowerCase().toCharArray()){
            characterMap.put(chr, characterMap.containsKey(chr) ? characterMap.get(chr) + 1 : 1);
        }

        for (int entry : characterMap.values()){
            if (entry > 1 ){
                result++;
            }
        }
        return result;
    }
}