import java.util.*;

public class MinimumCommonValue {

  public static int minimumCommonValue(int[] x, int[] y) {
    HashSet<Integer> set = new HashSet<>();
    int min = Integer.MAX_VALUE;

    for (int i : x)
      set.add(i);

    for (int j : y) {
      if (set.contains(j)) 
        min = Math.min(j, min);
    }

    return min;
  }

  public static void main(String[] args) {
    int[] nums1 = { 1, 2, 3 };
    int[] nums2 = { 2, 4 };

    System.out.println("Minimum common value is : " + minimumCommonValue(nums1, nums2));
  }
}