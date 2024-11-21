public class SubarraySumDivisiblebyK {

  public static int subArrayDivideByK(int[] nums, int k) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i; j < nums.length; j++) {
        
        int sum = 0;
        for (int l = i; l <= j; l++) {
          sum += nums[l];
        }

        if (sum % k == 0) count++;
      }
    }

    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 5, 6, 3, 9, 4, 6, 9 };
    int k = 7;

    System.out.println("Total subarrays whose sum is divisible by " + k + " is : " + subArrayDivideByK(nums, k) + " sub-arrays");
  }
}
