public class FindMinimuminRotatedSortedArray2 {

  public static int minimumInRotatedSortedArray(int[] nums) {

    int min = nums[0];

    for (int i = 0; i < nums.length; i++)
      min = Math.min(nums[i], min);

    return min;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 2, 2, 0, 1 };

    System.out.println("Minumum element is : " + minimumInRotatedSortedArray(nums));
  }

}
