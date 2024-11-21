public class MinimumSizeSubarraySum {

  public static int minimumSubarraySum(int[] nums, int target) {
    int size = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i; j < nums.length; j++) {
        
        int sum = 0;

        for (int k = i; k <= j; k++)
          sum += nums[k];

        if (sum >= target)
          size = Math.min(size, j - i + 1);
      }
    }

    return size;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 1, 2, 4, 3 };
    int target = 7;

    System.out.println("Minimum size subarray sum length is : " + minimumSubarraySum(nums, target));
  }
}