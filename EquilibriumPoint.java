public class EquilibriumPoint {

  /**
   * Finds the equilibrium point in the given array where the sum of elements on
   * the left is equal to the sum of elements on the right. If no such point
   * exists,
   * returns -1.
   *
   * @param nums the input array of integers
   * @return the index of the equilibrium point, or -1 if no such point exists
   */

  public static int equlibriumPoint(int[] nums) {
    int n = nums.length;

    int[] prefixSum = new int[n];
    prefixSum[0] = nums[0];

    for (int i = 1; i < n; i++)
      prefixSum[i] = prefixSum[i - 1] + nums[i];

    int total = prefixSum[n - 1];

    for (int i = 0; i < prefixSum.length; i++)
      if ((i == 0 && total - prefixSum[i] == 0) || (i > 0 && total - prefixSum[i] == prefixSum[i - 1]))
        return i;

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 4, 3, 2, 1 };

    System.out.println("Middle index is : " + equlibriumPoint(nums));
  }
}
