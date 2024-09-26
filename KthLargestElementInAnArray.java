import java.util.Arrays;

public class KthLargestElementInAnArray {

  public static void main(String[] args) {
    int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
    int k = 4;

    Arrays.sort(nums);
    System.out.println(nums[nums.length - k]);
  }

}
