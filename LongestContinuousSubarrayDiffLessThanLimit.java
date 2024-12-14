import java.util.*;

public class LongestContinuousSubarrayDiffLessThanLimit {

  /**
   * Returns the length of the longest subarray such that the difference
   * between the maximum and minimum elements is at most limit.
   * 
   * @param nums  the array
   * @param limit the limit
   * @return the length
   */

  public static int continuousSubarray(int[] nums, int limit) {
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> min = new PriorityQueue<>();

    int start = 0;
    int end = 0;
    int maxLength = Integer.MIN_VALUE;

    while (end < nums.length) {
      max.add(nums[end]);
      min.add(nums[end]);

      while (Math.abs(max.peek() - min.peek()) > limit) {
        max.remove(nums[start]);
        min.remove(nums[start]);

        start++;
      }

      maxLength = Math.max(end - start + 1, maxLength);
      end++;
    }

    return maxLength;
  }

  public static void main(String[] args) {
    int[] nums = { 8, 2, 4, 7 };
    int limit = 4;

    System.out.println("Maximum length of subarray whose element difference is less than or equal to limit is : "
        + continuousSubarray(nums, limit));
  }
}
