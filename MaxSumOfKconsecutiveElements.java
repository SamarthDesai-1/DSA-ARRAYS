public class MaxSumOfKconsecutiveElements {

  public static int maxSum(int[] nums, int k) {
    int sum = 0;
    int max = Integer.MIN_VALUE;

    for (int i = 0; i < k; i++)
      sum += nums[i];
      
    max = Math.max(max, sum);
      
    for (int i = k; i < nums.length; i++) {
      sum += nums[i] - nums[i - k]; 
      max = Math.max(max, sum);
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 500, 500, 300, 100, -200 };
    int k = 2;

    System.out.println("Maximum sum : " + maxSum(nums, k));
  }
}
