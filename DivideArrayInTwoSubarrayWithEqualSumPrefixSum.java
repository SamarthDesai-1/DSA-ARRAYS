public class DivideArrayInTwoSubarrayWithEqualSumPrefixSum {

  /**
   * Divide array in two parts with equal sum.
   * 
   * @param nums the array to be divided
   * @return "Yes" if the array can be divided in two parts with equal sum, "No"
   *         otherwise
   */
  
  public static String divideArray(int[] nums) {
    int prefixSum = 0;
    int totalSum = 0;

    for (int x : nums)
      totalSum += x;

    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];

      if (prefixSum == totalSum - prefixSum)
        return "Yes";
    }

    return "No";
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, -2, 5, 8, 20, -10, 8 };

    System.out.println("Possible to divide array in two parts with equal sum : " + divideArray(nums));
  }
}