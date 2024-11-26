import java.util.*;

public class SubarrayWithKDifferentInteger {

  public static int subArrayWithKdistinctInteger(int[] nums, int k) {
    int start = 0;
    int end = 0;
    int total = 0;
    int n = nums.length;
    int count = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    /** Atleast(k) - Atleast(k + 1) */
    while (end < n) {
      
      map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
      
      if (map.get(nums[end]) == 1) 
        count++;

      while (count == k) {
        
        total += n - end;
        
        map.put(nums[start], map.get(nums[start]) - 1);
        
        if (map.get(nums[start]) == 0)
          count--;

        start++;
      }
      end++;
    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1, 2, 3 };
    int k = 2;

    int result = Math.abs(subArrayWithKdistinctInteger(nums, k) - subArrayWithKdistinctInteger(nums, k + 1));
    System.out.println(result);
  }
}
