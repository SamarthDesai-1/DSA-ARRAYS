import java.util.*;

public class LengthOfLongestSubarrayWithAtMostKfrequency {

  public static int longestSubarrayWithAtmostKfrequency(int[] nums, int k) {

    int start = 0;
    int end = 0;
    int size = Integer.MIN_VALUE;
    HashMap<Integer, Integer> map = new HashMap<>();

    while (end < nums.length) {
      
      map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

      while (map.get(nums[end]) > k) {
        map.put(nums[start], map.get(nums[start]) - 1);
        start++;
      }

      size = Math.max(size, end - start + 1);
      end++;
    }

    return size;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1, 2, 3, 3, 4, 1, 2 };
    int k = 2;

    System.out.println("Longest subarray with at most " + k + " frequency is length of : " + longestSubarrayWithAtmostKfrequency(nums, k));
  }
}
