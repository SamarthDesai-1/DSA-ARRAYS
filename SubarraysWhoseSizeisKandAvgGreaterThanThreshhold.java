public class SubarraysWhoseSizeisKandAvgGreaterThanThreshhold {

  public static int numberOfSubarrays(int[] nums, int k, int threshold) {

    int start = 0;
    int end = 0;
    int sum = 0;
    int subarrays = 0;

    while (end < nums.length) {
      sum += nums[end];

      while ((end - start + 1) == k) {

        if (sum / k >= threshold)
          subarrays++;

        sum -= nums[start];

        start++;
      }

      end++;
    }

    return subarrays;
  }

  public static void main(String[] args) {
    int[] nums = { 2,2,2,2,5,5,5,8 };
    int k = 3;
    int threshold = 4;

    
    System.out.println("Number of subarrays with size " + k + " whose average is greater than or equal to threshold value is : " + numberOfSubarrays(nums, k, threshold) + " subarrays.");
  }
}
