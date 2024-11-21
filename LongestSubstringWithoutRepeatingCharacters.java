import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

  /** Solve this problem using sliding window technique 
   * 
   * Time Complexity : O(n)
   * Space Complexity : O(1)
   * 
  */
  public static int maxLength(String s) {
    int length = 0;

    boolean[] count = new boolean[256];
    int start = 0;
    int end = 0;

    while (end < s.length()) {
      
      while (count[s.charAt(end)]) {
        count[s.charAt(start)] = false;
        start++;
      }

      count[s.charAt(end)] = true;
      length = Math.max(length, end - start + 1);

      end++;
    }

    return length;
  }

  public static void main(String[] args) {
   
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();

      System.out.println("Maximum length of substring is : " + maxLength(s));
    }
  }
}
