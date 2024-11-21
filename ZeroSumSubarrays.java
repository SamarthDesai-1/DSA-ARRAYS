import java.util.*;

public class ZeroSumSubarrays {

  public static int zeroSubarrays(int[] nums) {
    int total = 0;
    int prefixSum = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i];

      if (map.containsKey(prefixSum)) {
        total += map.get(prefixSum);
      }
      map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 6, 4, -5, 1, 8, 3, 2, -10, -4, 0, 4, -9 };

    System.out.println("Zero sum subarrays are : " + zeroSubarrays(nums));
  }
}