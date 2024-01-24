-- Created by Ugur Kartal

public class Kata{
  public static boolean validateHello(String greetings){
    boolean isHello = false;
    String[] hello = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
    for(String word : hello){
      if(greetings.toLowerCase().contains(word)){
        isHello = true;
      }
    }
    return isHello;
  }
  
}