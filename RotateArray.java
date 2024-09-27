public class RotateArray {

  static class Rotate {

    public void rotate(int[] nums, int k) {
      k = k % nums.length;
      if (k < 0)
        k += nums.length;

      /** Part 1 */
      reverse(nums, 0, nums.length - 1 - k);

      /** Part 2 */
      reverse(nums, nums.length - k, nums.length - 1);

      /** Part 3 */
      reverse(nums, 0, nums.length - 1);
    }

    public void reverse(int[] nums, int i, int j) {
      int left = i;
      int right = j;

      while (left < right) {
        int temp = nums[right];
        nums[right] = nums[left];
        nums[left] = temp;
        left++;
        right--;
      }
    }

    public void display(int[] nums) {
      for (int x : nums)
        System.out.print(x + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
    int k = 31541;

    Rotate foo = new Rotate();
    foo.rotate(nums, k);
    foo.display(nums);
  }

}
