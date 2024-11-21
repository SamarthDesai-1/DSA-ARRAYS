import java.util.*;

public class MinimumWindowSubstring {

  public static int minimumSubstring(String s, String t) {

    int size = Integer.MAX_VALUE;

    for (int i = 0; i < s.length(); i++) {
      
      for (int j = i; j < s.length(); j++) {
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (int k = i; k <= j; k++) {
          char c = s.charAt(k);

          map.put(c, map.getOrDefault(c, 0) + 1);
        }

        boolean flag = false;

        /** Not traverse on string t for matching */
        for (int x = 0; x < t.length(); x++) {
          char c = t.charAt(x);
          
          if (map.containsKey(c)) {

            int frequency = map.get(c);
            if (frequency == 1) map.remove(c);
            else map.put(c, map.get(c) - 1);
          }
          else {
            flag = true;
            break;
          }
        }

        if (flag == false) {
          size = Math.min(size, j - i + 1);
        }
      }
    }

    return size == Integer.MAX_VALUE ? 0 : size;
  }

  public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";

    System.out.println("Length of minimum window substring is : " + minimumSubstring(s, t));
  }
}
