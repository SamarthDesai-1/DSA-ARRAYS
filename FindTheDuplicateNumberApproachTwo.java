import java.util.*;

public class FindTheDuplicateNumberApproachTwo {

  public static int duplicate(int[] nums) {

    int front = 0;
    int back = 0;

    while (front < nums.length) {
      
      int compareVal = nums[back];

      while (front < nums.length && compareVal == nums[front]) {
        front++;
      }

      int distance = front - back;
      if (distance > 1) return nums[back];

      back = front;
    }

    return - 1;
  }


  public static void main(String[] args) {
    int[] nums = { 1, 3, 3, 4, 2 };

    Arrays.sort(nums);

    System.out.println("Duplicate number is : " + duplicate(nums));
  }
}
