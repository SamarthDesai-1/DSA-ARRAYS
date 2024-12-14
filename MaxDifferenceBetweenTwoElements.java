public class MaxDifferenceBetweenTwoElements {

  /**
   * This function returns the maximum difference between two elements in the
   * given array.
   *
   * The approach is to first calculate the suffix maximums of the array, then
   * traverse the array from left to right.
   * For each element, we calculate the difference between the current element and
   * the maximum element in the right part of the array.
   * We keep track of the maximum difference seen so far and return it as the
   * result.
   *
   * @param nums The given array of integers.
   * @return The maximum difference between two elements in the array.
   */
  
  public static int maxDifference(int[] nums) {

    int n = nums.length;
    int[] suffixRightMax = new int[n];

    int maxDiff = Integer.MIN_VALUE;

    suffixRightMax[n - 1] = nums[n - 1];

    for (int i = n - 2; i >= 0; i--)
      suffixRightMax[i] = Math.max(suffixRightMax[i + 1], nums[i]);

    for (int i = 0; i < n - 1; i++)
      maxDiff = Math.max(maxDiff, suffixRightMax[i + 1] - nums[i]);

    return maxDiff;
  }

  public static void main(String[] args) {
    int[] nuns = { 9, 5, 8, 12, 2, 3, 7, 4 };

    System.out.println("Max difference : " + maxDifference(nuns));
  }
}
