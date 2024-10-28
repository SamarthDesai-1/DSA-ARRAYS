import java.util.*;

public class RemoveElement {

  public static void remove(int[] nums, int val) {

    ArrayList<Integer> list = new ArrayList<>();
  
    for (int i = 0; i < nums.length; i++) {
  
      if (nums[i] != val)
        list.add(nums[i]);
    }
  
    System.out.println("Value of K : " + list.size());
    System.out.println("Output array : " + list);
  }

  public static void main(String[] args) {

    int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
    int val = 2;

    remove(nums, val);
  }
}