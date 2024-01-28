-- Created by Ugur Kartal

import java.util.HashMap;
import java.util.Map;

public class FindOdd {
    public static int findIt(int[] a) {
        Map<Integer, Integer> arrayMap = new HashMap<>();
        for (int element : a){
            arrayMap.put(element, arrayMap.containsKey(element) ? arrayMap.get(element) + 1 : 1);
        }
        for (int key : arrayMap.keySet()){
            if (arrayMap.get(key) % 2 == 1){
                return key;
            }
        }
        return 0;
    }
}