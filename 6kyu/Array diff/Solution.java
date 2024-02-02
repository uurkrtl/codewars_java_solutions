-- Created by Ugur Kartal

import java.util.*;

public class Kata {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> listA = new ArrayList<>();
        List<Integer> listB = new ArrayList<>();
        for (int number : a){
            listA.add(number);
        }
        for (int number : b){
            listB.add(number);
        }
        listA.removeAll(listB);
        int[] result = new int[listA.size()];
        for (int i = 0; i<listA.size(); i++){
            result[i] = listA.get(i);
        }
        return result;
    }
}