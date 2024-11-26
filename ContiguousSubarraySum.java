import java.util.*;

public class ContiguousSubarraySum {

  public static boolean subarraySum(int[] nums, int k) {

    boolean output = true;
    int sum = 0;
    int remainder = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
      remainder = sum % k;

      if (remainder < k) 
        remainder += k;

      if (map.containsKey(remainder)) {

        if (i - map.get(remainder) > 1) 
          return true;
      }
      else 
        map.put(remainder, i);
    }

    return !output;
  }

  public static void main(String[] args) {
    int[] nums = { 23, 2, 6 ,4, 7 };
    int k = 13;

    System.out.println("Contiguous subarray sum is : " + subarraySum(nums, k));
  }  
}
