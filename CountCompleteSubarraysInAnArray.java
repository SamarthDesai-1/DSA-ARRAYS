import java.util.*;

public class CountCompleteSubarraysInAnArray {

  public static int distinctElem(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int x : nums) set.add(x);

    return set.size();
  }

  public static int atleast(int[] nums, int k) {
    int start = 0;
    int end = 0;
    int count = 0;
    int total = 0;
    HashMap<Integer, Integer> map = new HashMap<>();

    while (end < nums.length) {
      map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);

      if (map.get(nums[end]) == 1) 
        count++;

      while (count == k) {

        total += nums.length - end;

        map.put(nums[start], map.getOrDefault(nums[start], 0) - 1);

        if (map.get(nums[start]) == 0) 
          count--;

        start++;
      }
      end++;
    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 3, 1, 2, 2 };

    int k = distinctElem(nums);
    System.out.println("Total complete subarrays in an array is : " + (atleast(nums, k) - atleast(nums, k + 1)));
  } 
}
