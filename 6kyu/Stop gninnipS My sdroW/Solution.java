-- Created by Ugur Kartal

public class SpinWords {

    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder tempory = new StringBuilder();
        StringBuilder newWords = new StringBuilder();
        for (String word : words){
            tempory.append(word);
            newWords.append(word.length()>=5 ? tempory.reverse() : word);
            newWords.append(" ");
            tempory.delete(0, tempory.length());
        }
        newWords.deleteCharAt(newWords.length()-1);
        return newWords.toString();
    }
}