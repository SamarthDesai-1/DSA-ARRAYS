public class LongestAlphabeticalContinuousSubstring {

  public static String longestSubstring(String s) {

    int start = 0;
    int end = 1;
    int size = Integer.MIN_VALUE;
    int Si = -1;
    int Ei = -1;
    
    while (end < s.length()) {

      int ansOne = s.charAt(end) - 'a';
      int ansTwo = s.charAt(end - 1) - 'a';

      if (ansOne - ansTwo < 0 || ansOne - ansTwo != 1) {
        if (size < end - start) {
          size = end - start;
          Si = start;
          Ei = end ;
        }
        start = end;
      }

      end++;
    }
    
    if (end == s.length()) {
      if (size < end - start) {
        size = end - start;
        Si = start;
        Ei = end;
      }
    }
   
    return s.substring(Si, Ei);
  }

  public static void main(String[] args) {
    String s = "jk";

    System.out.println("Longest continuous alphabetical substring is : " + longestSubstring(s));
  }
}
