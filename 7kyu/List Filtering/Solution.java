-- Created by Ugur Kartal

import java.util.List;
import java.util.ArrayList;

public class Kata {

    public static List<Object> filterList(final List<Object> list) {
        List<Object> numbers = new ArrayList<>();
        for (Object element : list){
            if (element instanceof Number){
                numbers.add(element);
            }
        }
        return numbers;
    }
}