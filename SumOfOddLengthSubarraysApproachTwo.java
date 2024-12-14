public class SumOfOddLengthSubarraysApproachTwo {

  public static int oddLengthSubarrays(int[] nums) {
    int n = nums.length;
    
    int[] prefixSum = new int[n + 1];

    for(int i = 0; i < nums.length; i++) 
      prefixSum[i + 1] = prefixSum[i] + nums[i];

    int sumOfOddLengthSubarrays = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j <= i; j++) {
        if ((i - j + 1) % 2 == 1) 
          sumOfOddLengthSubarrays += prefixSum[i + 1] - prefixSum[j];
      }
    }

    return sumOfOddLengthSubarrays;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 4, 2, 5, 3 };

    System.out.println("Total of all odd length subarray is : " + oddLengthSubarrays(nums));
  }
}