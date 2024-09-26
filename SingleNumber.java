import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
  public static int solution(int[] nums) {

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

  public static void main(String[] args) {
    int[] nums = { 1 };
    int ans = solution(nums);
    System.out.println("Single number is : " + ans);

  }
}
