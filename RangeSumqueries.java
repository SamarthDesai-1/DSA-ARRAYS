public class RangeSumqueries {

  public static int rangeSum(int[] nums, int[] range) {

    int[] prefixSum = new int[nums.length];
    prefixSum[0] = nums[0];

    for (int i = 1; i < nums.length; i++)
      prefixSum[i] = prefixSum[i - 1] + nums[i];

    /** Process range queries */
    int first = range[0];
    int last = range[1];

    if (first == 0) 
      return prefixSum[last];
    else 
      return prefixSum[last] - prefixSum[first - 1];
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5 };
    int[] range = { 0, 4 };

    System.out.println("Sum from index " + range[0] + " to " + range[1] + " is : " + rangeSum(nums, range));
  }
}
