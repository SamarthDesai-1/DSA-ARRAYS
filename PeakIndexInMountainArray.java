public class PeakIndexInMountainArray {

  public static int peakIndex(int[] nums) {

    int index = -1;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max) {
        max = nums[i];
        index = i;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, 6, 9, 52, 89, 29, 36, 2 };

    System.out.println("Peak index in mountain array : " + peakIndex(nums));
  }

}
