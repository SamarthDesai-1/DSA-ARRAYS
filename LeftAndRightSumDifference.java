public class LeftAndRightSumDifference {

  public static int[] leftRightDifference(int[] nums) {
    int n = nums.length;
    int[] Lsum = new int[n];

    for (int i = 1; i < n; i++) 
      Lsum[i] = Lsum[i - 1] + nums[i - 1];

    int[] Rsum = new int[n];
    for (int i = n - 2; i >= 0; i--)
      Rsum[i] = Rsum[i + 1] + nums[i + 1];

    int[] res = new int[n];
    for (int i = 0; i < n; i++)
      res[i] = Math.abs(Lsum[i] - Rsum[i]);

    return res;
  }

  public static void main(String[] args) {
    int[] nums = { 10, 4, 8, 3 };

    for (int x : leftRightDifference(nums))
      System.out.print(x + " ");
  }
}
