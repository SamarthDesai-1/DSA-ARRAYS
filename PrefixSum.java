import java.util.*;

public class PrefixSum {

  static class Sum {
    int[] nums;

    Sum (int[] nums) {
      this.nums = nums;
    }

    public int[] prefixSum() {

      int[] sum = new int[nums.length];
      sum[0] = nums[0];

      for (int i = 1; i < sum.length; i++) 
        sum[i] = nums[i] + sum[i - 1];

      return sum;
    }
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter size of array : ");
      
      int size = input.nextInt();
      int[] nums = new int[size];

      for (int i = 0; i < nums.length; i++) 
        nums[i] = input.nextInt();

      Sum s = new Sum(nums);

      System.out.print("Prefix sum array : ");
      for (int x : s.prefixSum()) 
        System.out.print(x + " ");
    }
  }
}
