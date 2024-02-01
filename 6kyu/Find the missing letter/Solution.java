-- Created by Ugur Kartal

public class Kata
{
    public static char findMissingLetter(char[] array)
    {
        char[] lowercaseAlphabet = new char[26];
        for (int i = 0; i < 26; i++) {
            lowercaseAlphabet[i] = (char) ((Character.isUpperCase(array[0]) ? 'A' : 'a') + i);
        }
        int index = 0;
        boolean inArray = false;
        for (char letter : lowercaseAlphabet){
            if (array[index] == letter || inArray){
                if (array[index] != letter){
                    return letter;
                }
                index++;
                inArray = true;
            }
        }
        return ' ';
    }
}