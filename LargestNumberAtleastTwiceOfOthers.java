import java.util.*;

public class LargestNumberAtleastTwiceOfOthers {

  public static int largestNumberAtleastTwice(int[] nums) {
    
    int max = Integer.MIN_VALUE;
    int index = -1;
    
    for (int i = 0; i < nums.length; i++) {

      if (max < nums[i]) {
        max = nums[i];
        index = i;
      }
    }


    int n = nums.length;

    int x = 0;
    while (x < n) {
      if (nums[x] != max) {
        if (nums[x] * 2 > max) 
          return -1;
      }
      
      x++;
    }

    return index;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 6, 1, 0 };

    System.out.println(largestNumberAtleastTwice(nums));
  }
}