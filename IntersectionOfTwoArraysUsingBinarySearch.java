import java.util.*;

public class IntersectionOfTwoArraysUsingBinarySearch {

  public static HashSet<Integer> set = new HashSet<>();

  public static boolean binarySearch(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      if (nums[mid] == target) return true;
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return false;
  }

  public static void intersectPoints(int[] numsOne, int[] numsTwo) {

    Arrays.sort(numsOne);
    
    for (int i = 0; i < numsTwo.length; i++) {
      if (binarySearch(numsOne, numsTwo[i]))
        set.add(numsTwo[i]);
    }
  }

  public static void main(String[] args) {

    int[] numsOne = { 4,9,5 };
    int[] numsTwo = { 9,4,9,8,4 };

    intersectPoints(numsOne, numsTwo);

    System.out.println("Intersection of two arrays is : " + set);
  }
}
