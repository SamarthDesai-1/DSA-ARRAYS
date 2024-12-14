import java.util.*;

public class SlidingWindowMaximum {

  public static void maxInWindow(int[] nums, int k) {

    int start = 0;
    int end = 0;
    PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
    Vector<Integer> vector = new Vector<>();

    while (end < nums.length) {
      max.add(nums[end]);

      while (end - start + 1 >= k) {
        vector.add(max.peek());

        max.remove(nums[start]);
        start++;
      }

      end++;
    }

    System.out.println("Maximum in each subarray of length K");
    System.out.println(vector);
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, -3, 5, 6, 99, 10, 25, 250 };
    int k = 4;

    maxInWindow(nums, k);
  }
}
