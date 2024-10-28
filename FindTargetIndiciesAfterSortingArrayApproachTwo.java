import java.util.*;

public class FindTargetIndiciesAfterSortingArrayApproachTwo {

  public static Vector<Integer> findFirstAndLast(int[] nums, int target) {

    int first = -1;
    int second = -1;
    Vector<Integer> vector = new Vector<>();

    /** Find first index; */
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        first = i;
        break;
      }
    }

    for (int i = nums.length - 1; i >= 0; i--) {
      if (nums[i] == target) {
        second = i;
        break;
      }
    }

    if (first == -1 || second == -1) return vector;

    for (int i = first; i <= second; i++) vector.add(i);

    return vector;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 5, 2, 3 };
    int target = -2;

    /** Sort the array first; */
    Arrays.sort(nums);

    System.out.println("List of all target indices in sorted increasing order : " + findFirstAndLast(nums, target));
  }
}
