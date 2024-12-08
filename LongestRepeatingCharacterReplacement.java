public class LongestRepeatingCharacterReplacement {

  public static int longestString(String s, int k) {

    int start = 0;
    int end = 0;
    int maxCount = Integer.MIN_VALUE;
    int[] chars = new int[26];
    int length = Integer.MIN_VALUE;

    while (end < s.length()) {
      
      chars[s.charAt(end) - 'A']++;

      maxCount = Math.max(maxCount, chars[s.charAt(end) - 'A']);

      while (end - start + 1 - maxCount > k) {
        chars[s.charAt(start) - 'A']--;
        start++;
      }

      length = Math.max(length, end - start + 1);
      end++;
    }

    return length;
  }

  public static void main(String[] args) {
    String s = "ABAB";
    final int k = 2;
    
    System.out.println("Longest substring after replacing 1 character is : " + longestString(s, k) + " length.");
  }
}
