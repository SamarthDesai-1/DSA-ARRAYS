public class InverseOfArray {

  static class Solution {

    public void inverse(int[] nums) {
      int n = nums.length;
      int[] output = new int[n];

      for (int i = 0; i < n; i++)
        output[nums[i]] = i;

      System.out.print("Inverse : ");
      for (int x : output)
        System.out.print(x + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 3, 4, 1, 2, 0 };
    
    Solution foo = new Solution();
    foo.inverse(nums);
  }
}