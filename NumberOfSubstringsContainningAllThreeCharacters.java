import java.util.*;

public class NumberOfSubstringsContainningAllThreeCharacters {

  public static int substringsCount(String s, int k) {
    int start = 0;
    int end = 0;
    int count = 0;
    int total = 0;
    HashMap<Character, Integer> map = new HashMap<>();

    while (end < s.length()) {
      
      map.put(s.charAt(end), map.getOrDefault(s.charAt(end), 0) + 1);

      if (map.get(s.charAt(end)) == 1) 
        count++;

      while (count == k) {
        total += s.length() - end;

        map.put(s.charAt(start), map.get(s.charAt(start)) - 1);
        
        if (map.get(s.charAt(start)) == 0) 
          count--;
        
        start++;
      }
      end++;
    }

    return total;
  }

  public static void main(String[] args) {
    String s = "abc";
    int k = 3; /** it menas this k indicates the count of A B C because it is mention in the problem that a subatring at least contains one occurrence of A B C that's why I took k as 3 */

    System.out.println("Total substrings contains all three characters with at least one occurrence : " + substringsCount(s, k));
  }
}
