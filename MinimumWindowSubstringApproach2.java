import java.util.*;

public class MinimumWindowSubstringApproach2 {

  public static String minimumSubstring(String s, String t) {

    int start = 0;
    int end = 0;
    int ans = Integer.MAX_VALUE;
    int index = -1;
    int total = t.length();

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < t.length(); i++) {
      map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
    }
    
    while (end < s.length()) {
      
      map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) - 1);

      if (map.get(s.charAt(end)) >= 0) 
        total--;

      while (total == 0 && start <= end) {
        
        if (ans > end - start + 1) {
          ans = end - start + 1;
          index = start;
        }

        map.put(s.charAt(start), map.get(s.charAt(start)) + 1);

        if (map.get(s.charAt(start)) > 0) 
          total++;
        
        start++;
      }      

      end++;
    }

    return index == -1 ? "" : s.substring(index, ans + index);
  }

  public static void main(String[] args) {
    String s = "ADOBECODEBANC";
    String t = "ABC";

    System.out.println(" " + minimumSubstring(s, t));
  }  
}
