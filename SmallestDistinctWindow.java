import java.util.*;

public class SmallestDistinctWindow {

  public static int distinctWindow(String s) {
    int[] count = new int[256];
    int start = 0;
    int end = 0;
    int length = s.length();
    int diff = 0;

    /** Calculate distinct characters in the string */
    while (start < s.length()) {
      
      if (count[s.charAt(start)] == 0) diff++;

      count[s.charAt(start)]++;
      start++;
    }
    
    Arrays.fill(count, 0);
    start = 0;

    /** Find the smallest window */
    while (end < s.length()) {
      
      /** Diff value not equal to zero */
      while (diff != 0 && end < s.length()) {
        
        if (count[s.charAt(end)] == 0) diff--;

        count[s.charAt(end)]++;
        end++;
      }

      length = Math.min(length, end - start);
      
      /** Remove the first character of the window, till diff != 0 */
      while (diff != 1) {
        length = Math.min(length, end - start);

        count[s.charAt(start)]--;

        if (count[s.charAt(start)] == 0) diff++;
        start++;
      }
    }

    return length;
  }

  public static void main(String[] args) {
    String s = "AABBBCBBAC";

    System.out.println("Smallest distinct window length is : " + distinctWindow(s));
  } 
}
