public class SelectionSort {

  public static void main(String[] args) {
    int[] nums = { 1000, 9, 5, 2, 4, 6, 256, 95, 6, 8, -96, -5, -8, -3, -526 };
    for (int i = 0; i < nums.length - 2; i++) {

      int min = i;
      for (int j = i; j < nums.length; j++) {
        if (nums[j] < nums[min]) {
          min = j;
        }
      } 

      int temp = nums[min];
      nums[min] = nums[i];
      nums[i] = temp;
    }

    for (int x : nums)
      System.out.print(x + " ");
  }
}
