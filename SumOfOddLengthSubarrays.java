public class SumOfOddLengthSubarrays {

  /**
   * Returns the total sum of all odd length subarrays in the given array
   * 
   * @param nums the given array
   * @return the total sum of all odd length subarrays
   */

  public static int oddLengthSubarrays(int[] nums) {
    int total = 0;

    for (int i = 0; i < nums.length; i++) {

      for (int j = 0; j < nums.length; j++) {

        if ((j + i + 1) % 2 == 1) {

          int sum = 0;
          for (int k = i; k <= j; k++) 
            sum += nums[k];

          total += sum;
        }
      }
    }

    return total;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 4, 2, 5, 3 };

    System.out.println("Total of all odd length subarray is : " + oddLengthSubarrays(nums));
  }

}
