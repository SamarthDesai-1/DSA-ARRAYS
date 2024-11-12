public class BubbleSort {

  public static void bubbleSort(int[] nums) {

    int n = nums.length; 
    boolean swapped = false;

    for (int i = 0; i < n - 1; i++) {

      for (int j = 0; j < n - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int cache = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = cache;

          swapped = true;
        }
      }

      if (!swapped) break;
    }

  }

  public static void main(String[] args) {
    int[] nums = { 1000, 9, 5, 2, 4, 6, 256, 95, 6, 8, -96, -5, -8, -3, -526 };

    System.out.print("Unsorted Array = ");
    for (int x : nums) System.out.print(x + " ");

    bubbleSort(nums);
    System.out.println();

    System.out.print("Sorted Array using bubble sort = ");
    for (int x : nums) System.out.print(x + " "); 
  }
}