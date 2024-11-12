import java.util.*;

public class FirstUniqueCharacterInAString {

  public static int firstUniqueChar(String s) {

    int Ans = Integer.MAX_VALUE;
    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      
      if (!map.containsKey(c)) map.put(c, i);
      else map.put(c, -1); 
    }

    for (int x : map.values()) {
      if (x == -1) continue;
      
      Ans = Math.min(Ans, x);
    }

    return Ans == Integer.MAX_VALUE ? -1 : Ans;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();

      System.out.println("First unique character in a string is at index : " + firstUniqueChar(s));
    }
  } 
}
