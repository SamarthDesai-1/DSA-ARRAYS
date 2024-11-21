import java.util.*;

public class BinarySubArraysWithSum {

  public static int binarySubarrays(int[] nums, int goal) {
    int total = 0;
    int prefixSum = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int x : nums) {
      prefixSum += x;

      if (map.containsKey(prefixSum - goal)) {
        total = total + map.get(prefixSum - goal);
      }
      map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 0, 0, 0 };
    int goal = 0;

    System.out.println("Binary subarrays with sum equal to goal is : " + binarySubarrays(nums, goal));
  }
}
