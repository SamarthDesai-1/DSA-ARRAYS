import java.util.*;

public class MaximumSumOfAtleastUniqueSubarray {

  public static long uniqueSubarrays(int[] nums, int m, int k) {
    int start = 0;
    int end = 0;
    long sum = 0;
    long max = -1;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    while (end < nums.length) {
      sum += nums[end];

      map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

      if (map.get(nums[end]) == 1) 
        count++;
      
      if (end - start + 1 == k) {
        sum -= nums[start];

        map.put(nums[start], map.getOrDefault(nums[start], 0) - 1);
        if (map.get(nums[start]) == 0) 
          count--;
        
        start++;
      }

      if (count >= m && end - start + 1 == k)
        max = Math.max(max, sum);
        
      end++;
    }

    return max == -1 ? 0 : max;
  }

  public static void main(String[] args) {
    int[] arr = { 5, 9, 9, 2, 4, 5, 4 };
    int m = 1;
    int k = 3;

    System.out.println("Maximum sum of atleast unique subarray : " + uniqueSubarrays(arr, m, k));
  }
}
