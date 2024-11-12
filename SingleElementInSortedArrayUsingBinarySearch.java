public class SingleElementInSortedArrayUsingBinarySearch {

  public static int findDuplicate(int[] nums) {

    int n = nums.length;

    if (n == 1) return nums[0];
    if (nums[0] != nums[1]) return nums[0];
    if (nums[n - 1] != nums[n - 2]) return nums[n - 1];

    int start = 1;
    int end = n - 2;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) return nums[mid];
      else if ((mid % 2 == 0 && nums[mid] == nums[mid + 1]) || (mid % 2 == 1 && nums[mid] == nums[mid - 1])) /** We're in the left half */ {
        start = mid + 1;
      }
      else end = mid - 1; /** We're in the right half */
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = {1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6};

    System.out.println("Single element is : " + findDuplicate(nums));
  }
}
