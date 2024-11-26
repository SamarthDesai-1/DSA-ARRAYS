import java.util.*;

public class RepeatedDNAsequences {

  public static Vector<String> maxLength(String s) {

    Vector<String> ans = new Vector<>();

    @SuppressWarnings("unused")
    int start = 0;
    int end = 0;
    int n = s.length();
    StringBuffer current = new StringBuffer();
    HashMap<String, Integer> map = new HashMap<>();

    while (end < n) {
      
      current.append(s.charAt(end));

      while (current.length() == 10) {
        
        String curreString = current.toString();

        if (map.getOrDefault(curreString, 0) == 1) 
          ans.add(curreString);

        map.put(curreString, map.getOrDefault(curreString, 0) + 1);

        start++;

        current.deleteCharAt(0);
      }

      end++;
    }
    return ans;
  }


  public static void main(String[] args) {
    String s = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
    
    System.out.println(maxLength(s));
  } 
}