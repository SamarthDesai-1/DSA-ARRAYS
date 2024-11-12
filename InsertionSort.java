public class InsertionSort {

  public static void insertionSort(int[] nums) {

    int n = nums.length;

    for (int i = 1; i < n; i++) {
      
      int key = nums[i];
      int j = i - 1;

      while (j >= 0 && nums[j] > key) {
        nums[j + 1] = nums[j];
        j--;
      }

      nums[j + 1] = key;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1000, 9, 5, 2, 4, 6, 256, 95, 6, 8, -96, -5, -8, -3, -526 };

    System.out.print("Unsorted Array = ");
    for (int x : nums) System.out.print(x + " ");

    insertionSort(nums);
    System.out.println();
    
    System.out.print("Sorted Array using insertion sort = ");
    for (int x : nums) System.out.print(x + " ");
  }
}
