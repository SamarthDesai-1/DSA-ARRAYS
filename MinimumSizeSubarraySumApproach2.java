public class MinimumSizeSubarraySumApproach2 {

  public static int minimumSubarraySum(int[] nums, int target) {

    int n = nums.length;
    int start = 0;
    int end = 0;
    int size = Integer.MAX_VALUE;
    int windowSum = 0;

    while (end < n) {
      
      windowSum += nums[end];

      while (windowSum >= target) {
        size = Math.min(size, end - start + 1);
        windowSum -= nums[start];
        start++;
      }
      end++;
    }

    return size == Integer.MAX_VALUE ? 0 : size;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    int target = 7;

    System.out.println("Minimum size subarray sum length is : " + minimumSubarraySum(nums, target));
  }
}
