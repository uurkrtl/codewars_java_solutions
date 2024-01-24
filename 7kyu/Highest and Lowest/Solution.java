-- Created by Ugur Kartal

public class Kata {
  public static String highAndLow(String numbers) {
    String[] numberArray = numbers.split(" ");
	    int min = Integer.MAX_VALUE;
	    int max = Integer.MIN_VALUE;
	    for(String number : numberArray) {
	    	if(Integer.valueOf(number)>max) {
	    		max = Integer.valueOf(number);
	    	}
	    	if(Integer.valueOf(number)<min) {
	    		min = Integer.valueOf(number);
	    	}
	    }
	    return max + " " + min;
  }
}