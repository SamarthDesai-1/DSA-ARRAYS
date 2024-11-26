public class MaximumNumberOfVowelsInAsubstring {

  public static int maxLength(String s, int k) {
    String container = "aeiou";

    int start = 0;
    int end = 0;
    int size = Integer.MIN_VALUE;
    int count = 0;

    while (end < s.length()) {

      if (container.contains(s.charAt(end) + "")) 
        count++;

      while ((end - start + 1) == k) {
        size = Math.max(size, count);

        if (container.contains(s.charAt(start) + ""))
          count--;

        start++;
      }

      end++;
    }
    return size;
  }

  public static void main(String[] args) {
    String s = "leetcode";
    int k = 3;

    System.out.println("Substring with max vowel length is : " + maxLength(s, k));
  }
}
