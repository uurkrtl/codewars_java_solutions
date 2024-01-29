-- Created by Ugur Kartal

import java.util.*;

public class FindOutlier {
    static int find(int[] integers) {
        List<Integer> odds = new ArrayList<>();
        List<Integer> evens = new ArrayList<>();
        for (int element : integers){
            boolean add = element % 2 == 0 ? evens.add(element) : odds.add(element);
        }
        return odds.size()> evens.size() ? evens.get(0) : odds.get(0);
    }
}