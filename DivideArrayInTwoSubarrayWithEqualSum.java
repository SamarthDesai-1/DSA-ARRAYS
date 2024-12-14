public class DivideArrayInTwoSubarrayWithEqualSum {

  public static String divideArrayWithEqualSum(int[] nums) {

    int n = nums.length;

    for (int divider = 0; divider < nums.length; divider++) {
      
      /** Traverse first in left to divider */
      int sumX = 0;
      for (int x = 0; x <= divider; x++) 
        sumX += nums[x];
      
      
      /** Traverse second from divider to right */
      int sumY = 0;
      for (int y = divider + 1; y < n; y++) 
        sumY += nums[y];
      

      if (sumX == sumY)
        return "Yes";
    }

    return "No";
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, -2, 5, 8, 20, -10, 8 };

    System.out.println(divideArrayWithEqualSum(nums));
  }
}
