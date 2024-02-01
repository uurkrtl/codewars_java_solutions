-- Created by Ugur Kartal

import java.util.*;

public class PangramChecker {
    public boolean check(String sentence){
        int character = 0;
        Set<Character> characterSet = new HashSet<>();
        for (char chr : sentence.toLowerCase().toCharArray()){
            if (Character.isLetter(chr)){
                if (characterSet.add(chr)){
                    character++;
                }
            }
        }
        return character == 26;
    }
}