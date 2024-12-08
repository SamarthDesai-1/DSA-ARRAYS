import java.util.*;

public class SquareOfSortedArray {

  public static int[] squareSortedArray(int[] nums) {

    for (int i = 0; i < nums.length; i++) 
      nums[i] = (int) Math.pow(nums[i], 2);

    Arrays.sort(nums);

    return nums;
  }

  public static void main(String[] args) {
    int[] nums = { -4, -1, 0, 1, 3 };

    for (int x : squareSortedArray(nums))
      System.out.print(x + " ");
  }
}