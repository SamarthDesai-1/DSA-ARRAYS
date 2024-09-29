import java.util.Arrays;

public class BinarySearchAlgorithm {

  public static int binarySearch(int[] nums, int target) {

    Arrays.sort(nums);
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = (high + low) / 2;

      if (nums[mid] == target)
        return mid;
      else if (target > nums[mid])
        low = mid + 1;
      else
        high = mid - 1;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { -55, 59, -85, -65, -4965, 9555, 8, 5, 2, 1, 4, 7, 25, 24, 65, 2, 3, 6 };
    int target = 24;
    int result = binarySearch(nums, target);

    System.out.println("Target : " + target + " at index : " + result);
  }

}
