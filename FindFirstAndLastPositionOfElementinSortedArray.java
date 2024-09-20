import java.util.ArrayList;
import java.util.List;

public class FindFirstAndLastPositionOfElementinSortedArray {

  public static void solution(int[] nums, int target) {
    int first = -1;
    int last = -1;
    List<Integer> l = new ArrayList<>();
    
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        l.add(i);
        break;
      }
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == target) {
        l.add(i);
        break;
      }
    }
    if (l.size() == 0) {
      l.add(first);
      l.add(last);
    }
    System.out.println(l);
  }

  public static void main(String[] args) {
    int[] nums = {  };
    int target = 0;
    solution(nums, target);
  }

}
