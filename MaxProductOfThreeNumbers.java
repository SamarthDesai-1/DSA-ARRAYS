import java.util.Arrays;

public class MaxProductOfThreeNumbers {

  public static int solution(int[] nums) {
    Arrays.sort(nums);
    int n = nums.length;
    return Math.max((nums[n - 1] * nums[n - 2] * nums[n - 3]), (nums[0] * nums[1] * nums[n - 1]));
  }

  public static void main(String[] args) {
    int[] nums = { -100, -98, -1, 2, 3, 4 };

    System.out.println("Maximum product of three numbers : " + solution(nums));
  }
}
