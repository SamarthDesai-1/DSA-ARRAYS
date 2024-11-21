public class CountSubarrayWhereMaxElementAppearAtLeastKtimesApproach2 {

  public static int maxAtleastKtimes(int[] nums, int k) {
    int max = Integer.MIN_VALUE;
    int count = 0;
    int total = 0;

    for (int x : nums) 
      max = Math.max(max, x);

    int start = 0;
    int end = 0;

    while (end < nums.length) {
      
      if (nums[end] == max) 
        count++;
      
      while (count == k) {
        
        total += nums.length - end;

        if (nums[start] == max) 
          count--;

        start++;
      }    
      end++;
    }

    return total;
  }
  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 2, 3, 1, 2, 3, 3, 2 };
    int k = 2;

    System.out.println("Total subarrays with max element frequency " + k + " times is : " + maxAtleastKtimes(nums, k));
  }
}
