public class FindFirstOccurrenecOfaString {

  static class Solution {

    
    public int solution(String haystack, String needle) {
      char forSearch = needle.charAt(0);
      int ansIndex = -1;

      if (!haystack.contains(needle)) return -1;

      for (int i = 0; i < haystack.length(); i++) {
        
        int temp = i;

        if (haystack.charAt(i) == forSearch) {
          ansIndex = i;
          int count = 0;

          for (int j = 0; j < needle.length(); j++, temp++) {
            
            if (haystack.charAt(temp) == needle.charAt(j)) {
              count++;
            }
          }

          if (count == needle.length()) {
            return ansIndex;
          }
        }
      }
      return ansIndex;
    }

  }


  public static void main(String[] args) {
    String haystack = "leetcodeconfigurationbysamarthdesai";
    String needle = "i";

    Solution foo = new Solution();
    System.out.println("Found at index : " + foo.solution(haystack, needle));
  }
}
