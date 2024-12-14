import java.util.*;

public class IndexesOfSubarraySum {

  /**
   * Finds the start and end indices (1-based) of a contiguous subarray within the
   * given array `nums`
   * whose elements sum up to the specified `target`.
   *
   * @param nums   an array of integers
   * @param target the target sum to find in the subarray
   * @return an array containing the start and end indices (1-based) of the
   *         subarray if found,
   *         otherwise returns {-1, -1} if no such subarray exists
   */

  public static int[] subarraySumIndices(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    int prefixSum = 0;
    int i = 0;

    while (i < nums.length) {

      prefixSum += nums[i];

      if (prefixSum == target)
        return new int[] { 1, i + 1 };

      if (map.containsKey(prefixSum - target))
        return new int[] { map.get(prefixSum - target) + 2, i + 1 };

      map.putIfAbsent(prefixSum, i);

      i++;
    }

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 7, 5, 6 };
    int target = 6;

    for (int x : subarraySumIndices(nums, target))
      System.out.print(x + " ");
  }
}