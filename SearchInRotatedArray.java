public class SearchInRotatedArray {

  public static int binarySearch(int[] nums, int target) {

    int index = -1;
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {

      int mid = start + (end - start) / 2;
      if (nums[mid] == target) 
        return mid;
      else if (nums[mid] >= nums[0]) {
        if (nums[start] <= target && nums[mid] >= target)
          end = mid - 1;
        else
          start = mid + 1;
      } 
      else {
        if (nums[mid] <= target && nums[end] >= target)
          start = mid + 1;
        else
          end = mid - 1;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 4, 5, 6, 7, 0, 1, 2 };
    int target = 7;

    System.out.println(target + " found at index : " + binarySearch(nums, target) + "th");
  }

}
