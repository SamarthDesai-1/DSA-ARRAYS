public class LongestSubarrayOfOnesAfterDeletingOneElement {

  public static int longestSubarray(int[] nums) {

    int count = 0;
    int start = 0;
    int end = 0;
    int size = Integer.MIN_VALUE;

    while (end < nums.length) {
      
      if (nums[end] == 0) 
        count++;

      while (count > 1) {
        if (nums[start] == 0) 
          count--;

        start++;
      }

      size = Math.max(size, end - start);
      end++;
    }

    return size;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    System.out.println("Longest subarray length after replacing one zero with 1 : " + longestSubarray(nums));
  }
}
