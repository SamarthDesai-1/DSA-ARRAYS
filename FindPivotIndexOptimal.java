public class FindPivotIndexOptimal {

  /**
   * Finds the pivot index of the given array. The pivot index is the index
   * at which the sum of the elements before the index is equal to the sum
   * of the elements after the index.
   *
   * @param nums the given array
   * @return the pivot index of the given array; -1 if no such index exists
   */

  public static int findPivot(int[] nums) {
    int n = nums.length;

    int prefixSum = 0;
    int totalSum = 0;

    for (int x : nums)
      totalSum += x;

    for (int i = 0; i < n; i++) {
      prefixSum += nums[i];

      if (totalSum - prefixSum == prefixSum - nums[i])
        return i;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 15 };

    System.out.println("Pivot index is : " + findPivot(nums));
  }
}