import java.util.*;

public class TwoSumTwoPointerApproach {

  public static int[] twoSum(int[] nums, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      int remain = target - nums[i];
      if (map.containsKey(remain))
        return new int[] { map.get(remain), i };

      map.put(nums[i], i);
    }

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter size of the array : ");
      int size = input.nextInt();

      int[] nums = new int[size];
      for (int i = 0; i < size; i++) {
        System.out.print("Enter for nums[" + i + "] : ");
        nums[i] = input.nextInt();
      }

      System.out.print("Enter target value to find : ");
      int target = input.nextInt();


      System.out.print("Found at position : ");
      for (int x : twoSum(nums, target)) 
        System.out.print(x + " "); 
    }
  }
}
