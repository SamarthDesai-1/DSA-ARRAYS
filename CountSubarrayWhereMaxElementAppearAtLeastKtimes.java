public class CountSubarrayWhereMaxElementAppearAtLeastKtimes {

  public static int maxAtleastKtimes(int[] nums, int target) {

    int subarray = 0;

    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i; j < nums.length; j++) {
        
        int max = Integer.MIN_VALUE;
        int count = 0;

        for (int k = i; k <= j; k++) {
          max = Math.max(max, nums[k]);
        }

        for (int x = i; x <= j; x++) {
          if (max == nums[x]) 
            count++;
        }

        if (count >= target) 
          subarray++;
      }
    }

    return subarray;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 2, 3, 1, 2, 3, 3, 2 };
    int k = 2;

    System.out.println("Total subarrays with max element frequency " + k + " times is : " + maxAtleastKtimes(nums, k));
  }
}
