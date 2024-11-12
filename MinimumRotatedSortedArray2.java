public class MinimumRotatedSortedArray2 {

  public static int minimum(int[] nums) {

    int start = 0;
    int end = nums.length - 1;
    int potentialAnswer = nums[0];

    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (mid != start && nums[mid] == nums[start]) {
        start++;
        continue;
      } 
      else if (mid != end && nums[mid] == nums[end]) {
        end--;
        continue;
      }

      if (nums[mid] >= nums[0]) start = mid + 1;
      else {
        potentialAnswer = nums[mid];
        end = mid - 1;
      }
    }

    return potentialAnswer;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 1, 10, 10, 10, 10 };

    System.out.println("Minimum element is : " + minimum(nums));
  }
}