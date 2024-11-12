import java.util.*;

public class LongestSubstringBetweenTwoEqualCharacters {

  public static int longestSubstring(String s) {

    int maxLength = Integer.MIN_VALUE;
    HashMap<Character, Integer> map = new HashMap<>();
    StringBuffer substring = new StringBuffer();
    Vector<Integer> vector = new Vector<>();

    for (int i = 0; i < s.length(); i++) {
      
      char c = s.charAt(i);
      if (!map.containsKey(c)) map.put(c, i);
      else {
        int startIndex = map.get(c);
        maxLength = Math.max(maxLength, i - startIndex - 1);
        substring = new StringBuffer(s.substring(startIndex + 1, i));
        vector.clear();
        vector.add(startIndex);
        vector.add(i);
      }
    }

    System.out.println("Substring : " + substring);
    System.out.println("Length : " + substring.length());
    System.out.println("Index : " + vector);

    return maxLength;
  }

  public static void main(String[] args) {
    String s = "abcdeaaxyzdezabb";

    System.out.println("Longest substring length is : " + longestSubstring(s));
  }  
}
