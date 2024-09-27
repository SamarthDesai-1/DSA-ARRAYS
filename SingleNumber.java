import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

  public static int approachOne(int[] nums) {

    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i]))
        map.put(nums[i], 1);
      else
        map.put(nums[i], map.get(nums[i]) + 1);
    }

    for (Map.Entry<Integer, Integer> x : map.entrySet()) {
      if (x.getValue() == 1)
        return x.getKey();
    }

    return 0;
  }

  public static int approachTwo(int[] nums) {
    int count = 0;
    int x = 0;
    int y = 0;
    int min = Integer.MAX_VALUE;

    if (nums.length == 1)
      return nums[0];

    Arrays.sort(nums);
    int element = 0;
    while (y < nums.length) {
      if (nums[x] == nums[y]) {
        count++;
        y++;
      } 
      else {
        min = Math.min(min, count);
        if (count == 1) element = nums[x];
        count = 0;
        x = y;
      }
    }
    if (count == 1) element = nums[x];
    min = Math.min(min, count);

    return element;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 4, 3, 2, 1, 1, 1 };

    System.out.println("Approach One * Single number is : " + approachOne(nums));
    System.out.println("Approach Two * Single Number is : " + approachTwo(nums));
  }
}
