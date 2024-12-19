public class MaxSumSubarrayOfSizeK {

  public static int maximumSumSubarray(int[] nums, int k) {

    int start = 0;
    int end = 0;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    while (end < nums.length) {
      sum += nums[end];

      while ((end - start + 1) == k) {
        max = Math.max(max, sum);
        sum -= nums[start];
        start++;
      }

      end++;
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 100, 200, 300, 400 };
    int k = 2;

    System.out.println("Maximum sum subarray is : " + maximumSumSubarray(nums, k));
  }
}
