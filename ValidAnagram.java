import java.util.*;

public class ValidAnagram {

  public static boolean isAnagram(String str, String t) {

    if (str.length() != t.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);

      if (!map.containsKey(c)) map.put(c, 1);
      else map.put(c, map.get(c) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      char tChar = t.charAt(i);
      
      if (!map.containsKey(tChar) || map.get(tChar) == 0) return false; 
      map.put(tChar, map.get(tChar) - 1);
    }
    
    return true;
  }

  public static void main(String[] args) {
    String s = "aacc";
    String t = "ccac";

    boolean result = isAnagram(s, t);

    System.out.println("Is Anagram: " + result);
  }
}