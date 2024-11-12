public class findMaxBetweenPositiveAndNegativeBinarySearch {

  public static int findNegatives(int[] nums) {

    int start = 0;
    int end = nums.length - 1;
    int potentialIndex = -1;

    while (start <= end) {
      int mid = start + (end - start) / 2;

      if (nums[mid] >= 0) end = mid - 1;
      else {
        potentialIndex = mid;
        start = mid + 1;
      }
    }

    return potentialIndex + 1;
  }

  public static int findZeroLastIndex(int[] nums) {

    int start = 0;
    int end = nums.length - 1;
    int potentialIndex = -1;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] == 0) {
        potentialIndex = mid;
        start = mid + 1;
      }
      else if (nums[mid] > 0) end = mid - 1;
      else start = mid + 1;
    }

    return potentialIndex;
  }

  public static int maxBetweenPositiveAndNegative(int[] nums) {
    int n = nums.length;
  
    int negativeValues = findNegatives(nums);
    int positiveValues = findZeroLastIndex(nums);
  
    return Math.max(negativeValues, positiveValues == -1 ? n - negativeValues : n - positiveValues - 1);
  }


  public static void main(String[] args) {
    int[] nums = { -4, -3, -2, -1, 0, 0, 1, 2, 3 };

    System.out.println("Maximum between positve and negative values is : " + maxBetweenPositiveAndNegative(nums));
  }
}
