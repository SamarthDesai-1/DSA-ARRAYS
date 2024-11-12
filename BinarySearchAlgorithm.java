import java.util.Arrays;

public class BinarySearchAlgorithm {

  public static int binarySearch(int[] nums, int target) {

    Arrays.sort(nums);
    int n = nums.length;

    if (nums[0] == target) return 0;
    else if (nums[n - 1] == target) return n - 1;

    int start = 1;
    int end = n - 2;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) return mid;
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { -55, 59, -85, -65, -4965, 9555, 8, 5, 2, 1, 4, 7, 25, 24, 65, 2, 3, 6, -856, -96522, 55, 96500 };
    int target = 24;
    int result = binarySearch(nums, target);

    System.out.println("Target : " + target + " found at index : " + result);
  }
}
