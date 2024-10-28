import java.util.*;

public class MoveZeros {

  public static ArrayList<Integer> list = new ArrayList<>();

  public static void zeros(int[] nums) {

    int zeros = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) list.add(nums[i]);
      else zeros++;
    }

    for (int i = 1; i <= zeros; i++)
      list.add(0);

    System.out.println(list);
  }

  public static void main(String[] args) {
    int[] nums = { 5, 2, 5, 3, 0, 7, 0, 6, 27, 0, 0, 0, 0, 5, 2, 0, 515, 2 };

    zeros(nums);
  }                   
}

