public class SumOfOddLengthSubarraysApproachThree {

  /**
   * Calculate the sum of all odd-length subarrays in the given array.
   *
   * @param arr the array
   * @return the sum of all odd-length subarrays
   */

  public static int oddLengthSubarrays(int[] arr) {
    int n = arr.length;
    int totalSum = 0;

    for (int i = 0; i < n; i++) {
      // Total subarrays that include arr[i]
      int totalSubarrays = (i + 1) * (n - i);

      // Odd-length subarrays that include arr[i]
      int oddCount = (totalSubarrays + 1) / 2;

      // Contribution of arr[i]
      totalSum += arr[i] * oddCount;
    }

    return totalSum;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 4, 2, 5, 3 };

    System.out.println("Total of all odd length subarray is : " + oddLengthSubarrays(nums));
  }

}
