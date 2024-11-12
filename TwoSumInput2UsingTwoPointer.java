import java.util.*;

public class TwoSumInput2UsingTwoPointer {

  public static Vector<Integer> findPairs(int[] nums, int target) {

    Vector<Integer> vector = new Vector<>();

    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      
      int sum = nums[left] + nums[right];

      if (sum == target) {
        vector.add(left + 1);
        vector.add(right + 1);
        return vector;
      }
      else if (sum > target) right--;
      else left++;
    }

    return vector;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 7, 11, 15};
    int target = 9;

    System.out.println("Target : " + target + ", pairs found at indicies = " + findPairs(nums, target));
  }
}
