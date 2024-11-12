public class MaximumCountOfPositiveAndNegativeIntegers {

  public static int findMaxBetweenPositiveAndNegative(int[] nums) {

    int positive = 0;
    int negative = 0;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] < 0) negative++;
      else if (nums[i] > 0) positive++;
    }

    return Math.max(negative, positive);
  }
  

  public static void main(String[] args) {
    int[] nums = { -5, -4, -3, -2, -1, 0, 0, 1, 2 };

    System.out.println("Maximum between positive and negative is : " + findMaxBetweenPositiveAndNegative(nums));
  }
}