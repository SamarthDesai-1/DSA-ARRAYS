public class FindPeakElement {

  public static int peakElement(int[] nums) {

    int n = nums.length;
    int index = 0;

    if (nums[0] > nums[1] || n == 1)
      return index;

    for (int i = 1; i < nums.length - 1; i++) {
      if (i != n - 1 && nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
        index = i;
      }
    }

    if (nums[n - 1] > nums[n - 2])
      return n - 1;

    return index;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1, 3, 5, 6, 4 };

    System.out.println(peakElement(nums));
  }

}
