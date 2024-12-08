import java.util.*;

public class FindTargetIndiciesAfterSortingArray {

  public static int first = -1;
  public static int second = -1;
  public static int start = 0;
  public static int end;
  public static Vector<Integer> vector = new Vector<>();

  public static void fillVector(int[] nums) {

    if (first == -1 || second == -1) 
      return;
      
    for (int i = first; i <= second; i++) 
      vector.add(i);
  }

  public static void findIndexAfterSorting(int[] nums, int target, char flag) {

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) {
        if (flag == 'l') {
          first = mid;
          end = mid - 1;
        }
        else {
          second = mid;
          start = mid + 1;
        }
      }
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 5, 2, 3 };
    int target = 5;

    /** Sort the array first; */
    Arrays.sort(nums);

    /** Set the value for the end */
    end = nums.length - 1;

    findIndexAfterSorting(nums, target, 'l');

    start = 0;
    end = nums.length - 1;

    findIndexAfterSorting(nums, target, 'r');

    fillVector(nums);

    System.out.println("List of all target indices in sorted increasing order : " + vector);
  }
}