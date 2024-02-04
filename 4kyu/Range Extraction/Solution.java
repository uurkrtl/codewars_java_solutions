-- Created by Ugur Kartal

import java.util.*;

class Solution {
    public static String rangeExtraction(int[] arr) {
        StringBuilder result = new StringBuilder();
        List<Integer> tempList = new ArrayList<>();
        for (int number : arr){
            if (tempList.isEmpty()){
                tempList.add(number);
            } else if (tempList.get(tempList.size()-1)+1 == number) {
                tempList.add(number);
            } else {
                if (tempList.size() >2){
                    result.append(tempList.get(0) + "-" + tempList.get(tempList.size()-1));
                } else if (tempList.size() == 2) {
                    result.append(tempList.get(0) + "," + tempList.get(tempList.size()-1));
                }else {
                    result.append(tempList.get(0));
                }
                result.append(",");
                tempList.clear();
                tempList.add(number);
            }
        }

        if (tempList.size() >2){
            result.append(tempList.get(0) + "-" + tempList.get(tempList.size()-1));
        } else if (tempList.size() == 2) {
            result.append(tempList.get(0) + "," + tempList.get(tempList.size()-1));
        }else {
            result.append(tempList.get(0));
        }
        return result.toString();
    }
}