public class MinimumInRotatedArrayBinarySearch {

  public static int minimum(int[] nums) {

    int start = 0;
    int end = nums.length - 1;
    int potentialAnswer = nums[0];

    while (start <= end) {

      int mid = start + (end - start) / 2;
      if (nums[mid] >= nums[0])
        start = mid + 1;
      else {
        potentialAnswer = nums[mid];
        end = mid - 1;
      }
    }
    return potentialAnswer;
  }

  public static void main(String[] args) {
    int[] nums = { 4, 5, 6, 7, 0, 1, 2 };

    System.out.println("Minimum element from sorted array is : " + minimum(nums));
  }

}
