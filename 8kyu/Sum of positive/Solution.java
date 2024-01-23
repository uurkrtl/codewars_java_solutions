-- Created by Ugur Kartal

public class Positive{

  public static int sum(int[] arr){
    int sum = 0;
    for(int number : arr){
      if(number>0) sum += number;
    }
    return sum;
  }

}