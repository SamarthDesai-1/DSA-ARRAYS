public class ArithmeticSlices {

  public static int arithmeticSlices(int[] nums) {

    int start = 0;
    int end = 2;
    int total = 0;

    while (end < nums.length) {
        
      if (nums[end] - nums[end - 1] == nums[end - 1] - nums[end - 2]) {
        total += end - start - 1;
        end++;
      }
      else {
        start = end - 1;
        end++;
      }

    }

    return total;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };

    System.out.println("Arthimetic slices : " + arithmeticSlices(nums));
  }
}
