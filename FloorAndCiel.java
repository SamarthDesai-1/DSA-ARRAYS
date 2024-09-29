import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FloorAndCiel {

  static class Solution {

    public List<Integer> solution(int[] nums, int target) {
      List<Integer> list = new ArrayList<>();

      Arrays.sort(nums);
      int low = 0;
      int high = nums.length - 1;
      int floor = 0;
      int ciel = 0;

      while (low <= high) {
        int mid = (high + low) / 2;

        if (nums[mid] == target) {
          floor = nums[mid];
          ciel = nums[mid];
          break;
        }
        else if (target > nums[mid]) {
          low = mid + 1;
          floor = nums[mid];
        }
        else {
          high = mid - 1;
          ciel = nums[mid];
        }
      }
      list.add(floor);
      list.add(ciel);
      return list;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
    int target = 56;

    Solution foo = new Solution();
    System.out.println(foo.solution(nums, target));
  }

}
