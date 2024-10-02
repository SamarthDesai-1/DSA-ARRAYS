import java.util.*;

public class KthMissingPositiveIntegerBinarySearch {

  public static int binarySearch(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      
      int mid = (start + end) / 2;

      if (nums[mid] == target) return -1;
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    return target;
  }

  public static int kthMissingPositive(int[] nums, int k) {

    int count = 0;
    int potentialAnswer = 0;
    for (int i = 1; i <= nums[nums.length - 1]; i++) {
      
      int getVal = binarySearch(nums, i);
      if (count == k) return potentialAnswer;
      else if (getVal != -1) {
        potentialAnswer = getVal;
        count++;
      }
    }

    return potentialAnswer;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 3, 4, 7, 11, 12 };

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter K : ");
      int k = input.nextInt();

      System.out.println(k + "th missing positive integer is : " + kthMissingPositive(nums, k));
    }

  }

}
