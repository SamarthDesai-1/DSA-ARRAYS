import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionOfElementinSortedArrayTwo {

  public static void solution(int[] nums, int target, List<Integer> l) {
    int n = nums.length;
    int start = 0;
    int end = n - 1;
    
    while (start <= end) {
      int mid = (start + end) / 2;
      
      if (nums[mid] == target) {
        int i = mid;
        while (i >= 0 && nums[i] == target) i--;
        
        l.add(i + 1);
        i = mid;

        while (i < n && nums[i] == target) i++;
        
        l.add(i - 1);
        return;
      }
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
    l.add(-1);
    l.add(-1);
    return;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 6, 6, 7, 7, 7, 8, 8, 8, 8, 8, 9, 10 };
    int target = 5;
    List<Integer> l = new ArrayList<>();
    solution(nums, target, l);

    System.out.println(l);
  }
}
