-- Created by Ugur Kartal

import java.util.*;

public class Kata {
    public static int[] sortArray(int[] array) {
        int[] oddArray = new int[array.length];
        for (int i= 0; i<array.length; i++){
            oddArray[i] = array[i] % 2 == 1 ? array[i] : Integer.MAX_VALUE;
        }
        Arrays.sort(oddArray);
        int index = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] % 2 == 1){
                array[i] = oddArray[index];
                index++;
            }
        }
        return array;
    }
}