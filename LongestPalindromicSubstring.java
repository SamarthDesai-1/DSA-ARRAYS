public class LongestPalindromicSubstring {

  public static boolean isPalindrome(String s, int left, int right) {

    while (left <= right) {
      if (s.charAt(left) != s.charAt(right)) 
        return false;

      left++;
      right--;
    }

    return true;
  }

  public static String longestPalindromicSubstring(String s) {
    int maxLen = Integer.MIN_VALUE;
    StringBuffer buffer = new StringBuffer("");

    for (int i = 0; i < s.length(); i++) {
      
      for (int j = 0; j < s.length(); j++) {
        
        boolean result = isPalindrome(s, i, j);
        if (result) {

          if (maxLen < j - i + 1) {
            maxLen = j - i + 1;
            buffer = new StringBuffer(s.substring(i, j + 1));
          }
        }
      }
    }

    return buffer.toString();
  }

  public static void main(String[] args) {
    String s = "babad";

    System.out.println("Longest palindromic substring is : " + longestPalindromicSubstring(s));
  }
}
