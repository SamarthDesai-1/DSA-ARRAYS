import java.util.Arrays;

public class FindTheDuplicateNumberApproachThird {

  public static int findDuplicate(int[] nums) {
    int cache = nums[0];

    for (int i = 1; i < nums.length; i++) {
      
      if (cache != nums[i]) cache = nums[i];
      else return nums[i];
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, 3, 4, 2 };

    Arrays.sort(nums);
    System.out.println("Duplicate number is : " + findDuplicate(nums));
  }
}