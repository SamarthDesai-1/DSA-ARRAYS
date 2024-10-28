public class FindPeakElementBinarySearch {

  public static int findPeakIndex(int[] nums) {

    int n = nums.length - 1;

    if (n == 1 || nums[0] > nums[1]) return 0;
    if (nums[n - 1] > nums[n - 2]) return n - 1;

    int start = 0;
    int end = n;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] >= nums[mid - 1] && nums[mid] >= nums[mid + 1]) return mid;
      else if (nums[mid] > nums[mid - 1]) start = mid + 1;
      else end = mid - 1;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };

    System.out.println("Peak element is at index : " + findPeakIndex(nums));
  }
}
