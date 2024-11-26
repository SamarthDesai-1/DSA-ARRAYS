public class MaxConsecutiveIII {

  public static int maxSequenceLength(int[] nums, int k) {
    int start = 0;
    int end = 0;
    int size = Integer.MIN_VALUE;

    while (end < nums.length) {

      if (nums[end] == 0)
        k--;

      while (k < 0) {
        if (nums[start] == 0)
          k++;

        start++;
      }
      
      size = Math.max(size, end - start + 1);
      end++;
    }

    return size;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1 };
    int k = 3;

    System.out.println("Max length after fliping " + k + " 0's is : " + maxSequenceLength(nums, k));
  }
}
