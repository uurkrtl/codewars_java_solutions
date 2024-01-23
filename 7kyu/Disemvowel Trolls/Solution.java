-- Created by Ugur Kartal

public class Troll {
    public static String disemvowel(String str) {
      String newStr = "";
      char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
      boolean isVowel = false;
      for(int i=0; i<str.length(); i++){
        isVowel = false;
        for(char vowel : vowels){
          if(str.toLowerCase().charAt(i) == vowel){
            isVowel=true;
            break;
          }
        }
        if(!isVowel) newStr+=str.charAt(i);
      }
      return newStr;
    }
}