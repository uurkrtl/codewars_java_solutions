-- Created by Ugur Kartal

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
  public static int sortDesc(final int num) {
    String numString = String.valueOf(num);
		List<String> nums = new ArrayList<>();
		for(int i = 0; i<numString.length(); i++) {
			nums.add(numString.substring(i, i+1));
		}
		Collections.sort(nums);
		Collections.reverse(nums);
		numString="";
		for(String numElement : nums) {
			numString += numElement;
		}
		
		return Integer.valueOf(numString);
  }
}