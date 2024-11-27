public class LongestSubarrayOfOnesAfterDeletingOneElement {

  public static int longestSubarray(int[] nums) {

    int count = 0;
    int start = 0;
    int end = 0;
    int size = Integer.MIN_VALUE;

    while (end < nums.length) {
      
      count += nums[end] == 0 ? 1 : 0;

      while (count > 1) {
        count -= nums[start] == 0 ? 1 : 0;
        start++;
      }

      size = Math.max(size, end - start + 1);
      end++;
    }

    return size;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 0, 1, 1, 0, 1, 1, 1 };

    System.out.println("Longest subarray length after replacing one zero with 1 : " + longestSubarray(nums));
  }
}
