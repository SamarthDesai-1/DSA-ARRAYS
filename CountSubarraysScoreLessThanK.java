public class CountSubarraysScoreLessThanK {

  public static long subArraysScoreLessThanK(int[] nums, int k) {
    long count = 0;
    int start = 0;
    int end = 0;
    long score = 0;

    while (end < nums.length) {

      score += nums[end];

      while (score * (end - start + 1) >= k && start <= end) {
        
        score = score - nums[start];
        start++;
      }

      count = count + (end - start) + 1;
      end++;
    }
    
    return count;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 1, 4, 3, 5 };
    int k = 10;

    System.out.println("Subarrays score less than " + k + " is : " + subArraysScoreLessThanK(nums, k) + " subarrays.");
  }
}
