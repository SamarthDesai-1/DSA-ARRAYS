public class MaximumAverageSubarraySumSlidingWindow {

  public static double maximumAverageSubarray(int[] nums, int k) {
    double Ans = Integer.MIN_VALUE;

    int start = 0;
    int end = 0;
    double sum = 0;

    while (end < nums.length) {
      
      sum += nums[end];

      while ((end - start + 1) == k) {
        
        Ans = Math.max(Ans, (double) (sum / k));

        sum -= nums[start];
        start++;
      }
      end++;
    }
    
    return Ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 12, -5, -6, 50, 3 };
    int k = 4;

    System.out.println("Maximum average subarray sum is : " + maximumAverageSubarray(nums, k));
  }
}
