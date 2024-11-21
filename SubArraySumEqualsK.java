import java.util.*;

public class SubArraySumEqualsK {

  public static int sumEqualsK(int[] nums, int k) {
    int total = 0;
    int prefixSum = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int i = 0; i < nums.length; i++) {
      prefixSum += nums[i]; 

      if (map.containsKey(prefixSum - k)) {
        total += map.get(prefixSum - k);
      }
      map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
    }
    
    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 3, -6, 4, -2, 12 };
    int k = 8;

    System.out.println("Subarrays with sum K are : " + sumEqualsK(nums, k));
  }
}
