public class InsertionSort {

  static class Sort {
  
    public void insertionSort(int[] nums) {
      for (int i = 1; i < nums.length; i++) {
        int key = nums[i];
        int j = i - 1;

        while (j >= 0 && nums[j] > key) {
          nums[j + 1] = nums[j];
          j--;
        }
        nums[j + 1] = key;
      }
      for (int x : nums) System.out.print(x + " ");
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1000, 9, 5, 2, 4, 6, 256, 95, 6, 8, -96, -5, -8, -3, -526 };
    Sort foo = new Sort();
    foo.insertionSort(nums);
  }
}
