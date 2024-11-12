import java.util.Arrays;

public class CheckIfNDoubleEsist {

  public static int search(int[] nums, int target) {

    int n = nums.length;

    int start = 0;
    int end = n - 1;
    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] > target) end = mid - 1;
      else if (nums[mid] < target) start = mid + 1;
      else return mid;
    }

    return -1;
  }

  public static boolean checkDoubleExists(int[] nums) {
    boolean response = false;

    for (int i = 0; i < nums.length; i++) {
      int result = search(nums, 2 * nums[i]);

      if (result != i && result != -1) return !response;
    }
  
    return response;
  }

  public static void main(String[] args) {
    int[] nums = { -2, 0, 10, -19, 4, 6, -8 };
    Arrays.sort(nums);

    System.out.println("Double of any nums[x] is not present in an array : " + checkDoubleExists(nums));
  }
}
