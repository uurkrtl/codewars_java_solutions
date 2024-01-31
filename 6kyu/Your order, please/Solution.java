-- Created by Ugur Kartal

public class Order {
    public static String order(String words) {
        if (words.isEmpty()){
            return "";
        }else {
            String[] wordGroup = words.split(" ");
            String[] newArray = new String[wordGroup.length];
            int index = 0;
            for (String word: wordGroup){
                for (char chr : word.toCharArray()){
                    if(Character.isDigit(chr)){
                        index = Character.getNumericValue(chr) - 1;
                        newArray[index] = word;
                        break;
                    }
                }
            }
            String result = String.join(" ", newArray);
            return result;}
    }
}