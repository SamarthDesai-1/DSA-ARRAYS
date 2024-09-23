public class SpanOfArray {

  public static int solution(int[] nums) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > max)
        max = nums[i];
      else if (nums[i] < min)
        min = nums[i];
    }
    return max - min;
  }

  public static void main(String[] args) {
    int[] nums = { 5, 3, 2, 1, 9 };

    System.out.println(solution(nums));
  }
}
