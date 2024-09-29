import java.util.ArrayList;

public class SubsetsOfArray {

  public static void solution(int[] nums) {

    int limit = (int) Math.pow(2, nums.length);
    for (int i = 0; i < limit; i++) {
      
      /** convert i to binary and use 0's and 1's */
      String set = "";
      int temp = i;
      
      for (int j = nums.length - 1; j >= 0; j--) {
        int remainder = temp % 2;
        temp /= 2;

        if (remainder == 0) {
          set = "-" + set;
        }
        else {
          set = nums[j] + set;
        }
      }

      System.out.println(set);
    }

  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3 };
    solution(nums);
  }

}