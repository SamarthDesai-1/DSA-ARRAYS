public class SubarrayProductLessThanK {

  public static int productLessThanK(int[] nums, int k) {
    int n = nums.length;
    int total = 0;
    int start = 0;
    int end = 0;
    int product = 1;

    while (end < n) {
      product *= nums[end];

      while (product >= k && start <= end) {
        product /= nums[start];
        start++;
      }

      total = total + (end - start) + 1;
      end++;
    }

    return total;
  } 

  public static void main(String[] args) {
    int[] nums = { 2, 5, 10, 8, 100, 1000, 5, 15 };
    int k = 999;

    System.out.println("Subarrays product less than " + k + " is : " + productLessThanK(nums, k));
  }
}
