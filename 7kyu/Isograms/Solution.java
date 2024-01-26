-- Created by Ugur Kartal

import java.util.HashSet;
import java.util.Set;

public class isogram {
    public static boolean  isIsogram(String str) {
        Set<Character>  chrSet = new HashSet<>();
        for (char chr : str.toLowerCase().toCharArray()){
            if (!chrSet.add(chr)){
                return false;
            }
        }
        return true;
    }
}