import java.util.*;

public class SubarraySumDivisiblebyKApproach2 {

  public static int subArraySumDivisibleByK(int[] nums, int k) {
    int total = 0;
    int prefixSum = 0;
    int remainder = 0;

    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, 1);

    for (int x : nums) {
      prefixSum += x;

      remainder = prefixSum % k;
      if (remainder < 0) 
        remainder += k;

      if (map.containsKey(remainder)) {
        total = total + map.get(remainder);
      }
      
      map.put(remainder, map.getOrDefault(remainder, 0) + 1);
    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, -8, -3, 11, 4, 8, 6, 9, 4 };
    int k = 5;

    System.out.println("Total subarrays sum divisible by " + k + " is : " + subArraySumDivisibleByK(nums, k));
  }
}
