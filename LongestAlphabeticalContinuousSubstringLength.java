public class LongestAlphabeticalContinuousSubstringLength {

  public static int longestSubstring(String s) {

    int start = 0;
    int end = 1;
    int size = Integer.MIN_VALUE;
    
    while (end < s.length()) {

      int ansOne = s.charAt(end) - 'a';
      int ansTwo = s.charAt(end - 1) - 'a';

      if (ansOne - ansTwo < 0 || ansOne - ansTwo != 1) {
        size = Math.max(size, end - start);
        start = end;
      }

      end++;
    }
    
    if (end == s.length()) 
      size = Math.max(size, end - start);
   
    return size;
  }

  public static void main(String[] args) {
    String s = "jkabc";

    System.out.println("Longest continuous alphabetical substring is : " + longestSubstring(s));
  }
}
