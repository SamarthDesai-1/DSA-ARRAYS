import java.util.*;

public class ThreeSumClosest {

  public static int threeSumClosest(int[] nums, int target) {
    Arrays.sort(nums);
    int closest = 0;
    int gap = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      
      int left = i + 1;
      int right = nums.length - 1;

      while (left < right) {
        int sum = nums[i] + nums[left] + nums[right];

        if (sum < target) {
          if (target - sum < gap) {
            gap = target - sum;
            closest = sum;
          }
          left++;
        }
        else if (sum > target) {
          if (sum - target < gap) {
            gap = sum - target;
            closest = sum;
          }
          right--;
        }
        else 
          return sum;
      }
    }

    return closest;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 2, 1, -4 };
    int target = 1;

    System.out.println("Closest to target " + "= " + target + " is : " + threeSumClosest(nums, target));
  }
}
