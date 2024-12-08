public class ProductOfArrayExceptSelf {

  public static int[] arrayProduct(int[] nums) {
    int n = nums.length;

    int[] prefix = new int[n];
    int[] suffix = new int[n];
    
    prefix[0] = 1;
    for (int i = 1; i < n; i++)
      prefix[i] = nums[i - 1] * prefix[i - 1];

    suffix[n - 1] = 1;
    for (int i = n - 2; i >= 0; i--) 
      suffix[i] = nums[i + 1] * suffix[i + 1];

    for (int i = 0; i < nums.length; i++) 
      nums[i] = prefix[i] * suffix[i];

    for (int i = 0; i < n; i++)
      nums[i] = prefix[i] * suffix[i];

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 1, 0, 3, -3 };

    for (int x : arrayProduct(nums))
      System.out.print(x + " ");
  }
}
