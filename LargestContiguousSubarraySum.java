public class LargestContiguousSubarraySum {

  public static int maxSum(int[] nums) {

    int max = Integer.MIN_VALUE;
    
    for (int i = 0; i < nums.length; i++) {
      
      int prefixSum = 0;
      
      for (int j = 0; j < nums.length; j++) {
        prefixSum += nums[i];
        max = Math.max(max, prefixSum);
      }
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 4, -6, 2, 8 };

    System.out.println("Maximum subarray sum is : " + maxSum(nums));
  }
}
