import java.util.*;

public class KthMissingPositiveIntegerBinarySearch {

  public static int kthMissingPositive(int[] nums, int k) {

    int potentialAnswer = 0;


    return potentialAnswer;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter K : ");
      int k = input.nextInt();

      System.out.println(k + "th missing positive integer is : " + kthMissingPositive(nums, k));
    }
  }
}