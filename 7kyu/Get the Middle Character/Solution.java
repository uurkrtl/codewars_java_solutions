-- Created by Ugur Kartal

class Kata {
  public static String getMiddle(String word) {
    int length = word.length();
		if(length % 2 == 0) {
			return word.substring(length/2-1, length/2+1);
		}else {
			return word.substring(length/2,length/2+1);
		}
  }
}