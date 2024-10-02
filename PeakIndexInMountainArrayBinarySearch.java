public class PeakIndexInMountainArrayBinarySearch {

  public static int peakIndex(int[] nums) {

    int potentialIndex = -1;
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      int mid = end + (start - end) / 2;

      if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
        return mid;
      else if (nums[mid] > nums[mid - 1])
        start = mid + 1;
      else
        end = mid - 1;
    }

    return potentialIndex;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, 6, 9, 52, 89, 29, 36, 2 };

    System.out.println("Peak index in mountain array : " + peakIndex(nums));
  }

}
