import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastIndexBinarySearch {

  public static List<Integer> solution(int[] nums, int target) {

    List<Integer> list = new ArrayList<>();
    int low = 0;
    int high = nums.length - 1;
    int firstIndex = -1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (target > nums[mid]) low = mid + 1;
      else if (target < nums[mid]) high = mid - 1;
      else {
        firstIndex = mid;
        high = mid - 1;
      }
    }
    
    low = 0;
    high = nums.length - 1;
    int lastIndex = -1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (target > nums[mid]) low = mid + 1;
      else if (target < nums[mid]) high = mid - 1;
      else {
        lastIndex = mid;
        low = mid + 1;
      }
    }
    list.add(firstIndex);
    list.add(lastIndex);

    return list;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 20, 20, 20, 30, 40, 50, 50, 50, 50, 60, 70, 80, 90, 90, 100 };
    int target = 20;

    System.out.println(solution(nums, target));
  }

}
