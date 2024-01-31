-- Created by Ugur Kartal

// Make sure your class is public
import java.util.*;

public class Kata {
    public static double findUniq(double arr[]) {
        Map<Double, Integer> numbers = new HashMap<>();
        for (double number : arr){
            numbers.put(number, numbers.containsKey(number) ? numbers.get(number) + 1 : 1);
        }
        for (Map.Entry<Double, Integer> entry : numbers.entrySet()){
            if (entry.getValue() == 1){
                return entry.getKey();
            }
        }
        return 0;
    }
}