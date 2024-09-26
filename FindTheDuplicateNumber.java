import java.util.Arrays;

public class FindTheDuplicateNumber {

  public static int solution(int[] nums) {
    Arrays.sort(nums);
    int x = 0;
    int y = x + 1;
    while (y < nums.length) {
      if (nums[x] == nums[y]) {
        return nums[x];
      }
      x++;
      y++;
    }

    return 0;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 5, 4, 5 };
    int ans = solution(nums);
    System.out.println(ans);
  }

}
