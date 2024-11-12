import java.util.*;

public class TwoSumInput2 {

  public static int search(int[] nums, int target, int start) {
    int end = nums.length - 1;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) return mid;
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return -1;
  }

  public static Vector<Integer> findPairs(int[] nums, int target) {

    Vector<Integer> vector = new Vector<>();

    for (int i = 0; i < nums.length; i++) {
      int result = search(nums, target - nums[i], i + 1);

      if (result != -1) {
        vector.add(i + 1);
        vector.add(++result);
        return vector;
      }
    }

    return vector;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 4, 4, 9, 56, 90 };
    int target = 8;

    System.out.println("Target : " + target + ", pairs found at indicies = " + findPairs(nums, target));
  }
}
