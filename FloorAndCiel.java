import java.util.*;

public class FloorAndCiel {

  static class Solution {

    public Vector<Integer> solution(int[] nums, int target) {
      Vector<Integer> vector = new Vector<>();

      Arrays.sort(nums);
      int start  = 0;
      int end = nums.length - 1;
      int floor = 0;
      int ciel = 0;

      while (start  <= end) {
        int mid = (end + start ) / 2;

        if (nums[mid] == target) {
          floor = nums[mid];
          ciel = nums[mid];
          break;
        }
        else if (target > nums[mid]) {
          start  = mid + 1;
          floor = nums[mid];
        }
        else {
          end = mid - 1;
          ciel = nums[mid];
        }
      }
      vector.add(floor);
      vector.add(ciel);
      return vector;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int target = 56;

    Solution foo = new Solution();
    System.out.println(foo.solution(nums, target));
  }
}
