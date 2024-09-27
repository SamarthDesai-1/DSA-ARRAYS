public class ReverseArray {

  static class Reverse {

    public void reverse(int[] nums) {

      int start = 0;
      int end = nums.length - 1;
      while (start <= end) {
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
        start++;
        end--;
      }
    }

    public void display(int[] nums) {
      for (int x : nums) System.out.print(x + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4, 5, 6 };
    Reverse foo = new Reverse();
    
    foo.reverse(nums);
    foo.display(nums);
  }

}
