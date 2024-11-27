public class PermutationInString {

  public static String isExistsPermutation(String s1, String s2) {
    int start = 0;
    int end = 0;
    int count = s1.length();
    int index = -1;
    int length = -1;
    int[] nums = new int[256];

    for (int i = 0; i < s1.length(); i++) 
      nums[s1.charAt(i)]++;

    while (end < s2.length()) {
      
      nums[s2.charAt(end)]--;

      if (nums[s2.charAt(end)] >= 0) 
        count--;

      while (count == 0) {
        
        if (end - start + 1 == s1.length()) {
          index = start;
          length = end - start + 1;
          return s2.substring(index, index + length);
        }
        

        nums[s2.charAt(start)]++;

        if (nums[s2.charAt(start)] > 0)
          count++;

        start++;
      }

      end++;
    }

    return "Permutation not found.";
  }


  public static void main(String[] args) {
    String s1 = "ab";
    String s2 = "eidboaooo";

    System.out.println(isExistsPermutation(s1, s2));
  }
}
