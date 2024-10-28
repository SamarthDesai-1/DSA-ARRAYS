public class SearchInRotatedArray2 {

  public static boolean searchInRotatedArray2(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    boolean result = false;

    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (nums[mid] == target)
        return !result;
      else if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
        start++;
        end--;
        continue;
      } 
      else if (nums[mid] > nums[start]) {
        if (nums[start] <= target && target <= nums[mid])
          end = mid - 1;
        else
          start = mid + 1;
      } 
      else {
        if (nums[mid] <= target && target <= nums[end])
          start = mid + 1;
        else
          end = mid - 1;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 0, 1, 1, 1 };
    int target = 0;

    System.out.println(searchInRotatedArray2(nums, target));
  }

}
