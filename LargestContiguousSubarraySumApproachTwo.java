public class LargestContiguousSubarraySumApproachTwo {

  /**
   * This function takes an array of integers and returns the maximum sum of a
   * subarray.
   * The time complexity of this algorithm is O(n) and the space complexity is
   * O(1) as it
   * only uses a single variable to keep track of the maximum sum seen so far and
   * the
   * current prefix sum.
   * 
   * @param nums an array of integers
   * @return the maximum sum of a subarray
   */
  
  public static int maximumSum(int[] nums) {

    /** This is Kadane's Algorithm for find maximum subarray sum in O(n) time. */

    int max = Integer.MIN_VALUE;
    int prefixSum = 0;

    for (int x : nums) {
      prefixSum += x;

      max = Math.max(max, prefixSum);

      if (prefixSum < 0)
        prefixSum = 0;
    }

    return max;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, -5, 8, -12, 7, 6, -2 };

    System.out.println("Maximum subarray sum is : " + maximumSum(nums));
  }
}
