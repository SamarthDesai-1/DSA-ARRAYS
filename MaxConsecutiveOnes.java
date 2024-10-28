public class MaxConsecutiveOnes {

  public static int maxOnes(int[] nums) {

    int Ans = 0;

    for (int i = 0; i < nums.length; i++) {

      if (nums[i] == 1) {

        int ones = 0;
        int x = i;

        while (x < nums.length && nums[x] == 1) {
          ones++;
          x++;
        }

        i = x;
        Ans = Math.max(Ans, ones);
      }
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0 };

    System.out.println("Max consecutive ones : " + maxOnes(nums));
  }
}
