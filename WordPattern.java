import java.util.*;

public class WordPattern {

  public static boolean isPattern(String pattern, String s) {
    String[] arr = s.split(" ");

    if (pattern.length() < arr.length) return false;

    HashMap<Character, String> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();

    for (int i = 0; i < pattern.length(); i++) {
      
      if (!map.containsKey(pattern.charAt(i))) {

        if (i < arr.length && !set.contains(arr[i])) {
          map.put(pattern.charAt(i), arr[i]);
          set.add(arr[i]);
        }
        else 
          return false;
      }
      else {
        String temp = map.get(pattern.charAt(i));
        if (!arr[i].equals(temp)) 
          return false;
      }
    }
    
    return true;
  }

  public static void main(String[] args) {
    String pattern = "jquery";
    String s = "jquery";

    System.out.println(isPattern(pattern, s));
  }
}