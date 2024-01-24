-- Created by Ugur Kartal

public class SquareDigit {

  public int squareDigits(int n) {
    String numString = String.valueOf(n);
		StringBuilder sum = new StringBuilder();
		for(int i = 0; i<numString.length(); i++) {
			sum.append((int)Math.pow(Integer.valueOf(numString.substring(i, i+1)), 2));
		}
		return Integer.valueOf(sum.toString());
  }

}