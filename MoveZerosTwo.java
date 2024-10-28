public class MoveZerosTwo {

  public static void main(String[] args) {
    int[] nums = { 0, 5, 2, 9, 0, 2, 5 };

    int left = 0;
    for (int right = 0; right < nums.length; right++) {

      if (nums[right] != 0) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
        left++;
      }
    }

    for (int x : nums) System.out.print(x + " ");
  }
}
