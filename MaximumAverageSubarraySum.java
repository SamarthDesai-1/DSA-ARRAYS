public class MaximumAverageSubarraySum {

  public static double maxAverageSubarray(int[] nums, int k) {
    
    double Ans = Integer.MIN_VALUE;
    double sum = 0;
    
    for (int i = 0; i < k; i++) 
      sum = sum + nums[i];

    int start = 0;
    int end = k - 1;

    Ans = Math.max(Ans, (double) (sum / k));
    
    while (end < nums.length - 1) {
      
      sum = sum - nums[start];
      sum = sum + nums[end + 1];
      
      Ans = Math.max(Ans, (double) (sum / k));

      start++;
      end++;
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 12, -5, -6, 50, 3 };
    int k = 4;

    System.out.println("Maximum average subarray sum is : " + maxAverageSubarray(nums, k));
  }
}
