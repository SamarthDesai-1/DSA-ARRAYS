import java.util.*;

public class FindTheDifference {

  public static char difference(String s, String t) {
    
    char potentialAns = ' ';

    HashMap<Character, Integer> map = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (!map.containsKey(c)) map.put(c, 1);
      else map.put(c, map.get(c) + 1);
    }

    for (int i = 0; i < t.length(); i++) {
      char c = t.charAt(i);

      if (map.containsKey(c)) {
        int count = map.get(c);

        if (count == 1) map.remove(c);
        else map.put(c, count - 1);
      }
      else return c;
    }

    return potentialAns;
  }

  public static void main(String[] args) {
    String s = "xyz";
    String t = "xxyz";
    
    char Ans = difference(s, t);
    System.out.println("Extra character is : " + (Ans == ' ' ? "NO EXTRA CHARACTER FOUND" : Ans));
  }
}
