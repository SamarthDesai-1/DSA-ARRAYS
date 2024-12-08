import java.util.*;

public class ContiguousSubarray {

  public static int contiguousSubarray(int[] nums) {

    for (int i = 0; i < nums.length; i++)
      if (nums[i] == 0)
        nums[i] = -1;
    
    HashMap<Integer, Integer> map = new HashMap<>();
    map.put(0, -1);

    int prefixSum = 0;
    int maxLength = Integer.MIN_VALUE;

    int i = 0;
    while (i < nums.length) {
      prefixSum += nums[i];

      if (map.containsKey(prefixSum)) 
        maxLength = Math.max(maxLength, i - map.get(prefixSum));

      else 
        map.put(prefixSum, i);

      i++;
    }

    return maxLength == Integer.MIN_VALUE ? 0 : maxLength;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 1, 0, 1 };

    System.out.println("Maximum length of subarray which contains equal number of 1s and 0s is : " + contiguousSubarray(nums));
  }
}
