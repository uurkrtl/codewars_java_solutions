-- Created by Ugur Kartal

import java.util.*;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}