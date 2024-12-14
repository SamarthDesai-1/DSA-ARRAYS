import java.util.*;

public class MaximumNumberOfBallons {

  public static int maximumOccurrences(String s) {

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);

      if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {

        map.put(c,map.getOrDefault(c, 0) + 1);

      }
    }

    int sum = 0;
    for (int x : map.values())
      sum += x;

    if (sum % 7 == 0)
      return sum / 7;

    return 0;
  } 

  public static void main(String[] args) {
    String s = "zybbaalloollnooxb";

    System.out.println(maximumOccurrences(s));
  }
}