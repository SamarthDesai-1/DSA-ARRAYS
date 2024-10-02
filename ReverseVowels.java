import java.util.*;

public class ReverseVowels {

  public static String reverse(String str) {
    /** two pointer approach */

    String set = "aeiouAEIOU";

    int start = 0;
    int end = str.length() - 1;
    StringBuffer buffer = new StringBuffer(str);
    while (start <= end) {
      
      if (set.contains(buffer.charAt(start) + "") && set.contains(buffer.charAt(end) + "")) {
        char cache = buffer.charAt(end);
        buffer.setCharAt(end, buffer.charAt(start));
        buffer.setCharAt(start, cache);

        start++;
        end--;
      }
      else if (!set.contains(buffer.charAt(start) + "")) 
        start++;
      else if (!set.contains(buffer.charAt(end) + ""))
        end--;
      else {
        start++;
        end--;
      }
    }

    return buffer.toString();
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String str = input.next();
      System.out.println("[" + str + "]" + " reverse vowel string : " + reverse(str));

    }
  }
}
