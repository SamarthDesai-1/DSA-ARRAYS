public class FindPivotIndex {

  /**
   * Finds the pivot index in the given array such that the sum of elements at the
   * left side of the index is equal to the sum of elements at the right side of
   * the index.
   * If no such index exists, returns -1.
   * 
   * @param nums the given array
   * @return the pivot index if found, -1 otherwise
   */
  
  public static int findPivot(int[] nums) {
    int n = nums.length;

    int[] prefixSum = new int[n];
    prefixSum[0] = nums[0];

    for (int i = 1; i < n; i++)
      prefixSum[i] = prefixSum[i - 1] + nums[i];

    int totalSum = prefixSum[n - 1];

    for (int i = 0; i < n; i++)
      if ((i == 0 && totalSum - prefixSum[i] == 0) || (i > 0 && totalSum - prefixSum[i] == prefixSum[i - 1]))
        return i;

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 1, -1 };

    System.out.println("Pivot index is : " + findPivot(nums));
  }
}