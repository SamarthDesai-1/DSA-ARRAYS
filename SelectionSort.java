public class SelectionSort {

  public static void selectionSort(int[] nums) {

    for (int i = 0; i < nums.length - 1; i++) {
      
      int minIndex = i;

      for (int j = i + 1; j < nums.length; j++) {
        if (nums[j] < nums[minIndex]) 
          minIndex = j;
      }

      int temp = nums[minIndex];
      nums[minIndex] = nums[i];
      nums[i] = temp;
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1000, 9, 5, 2, 4, 6, 256, 95, 6, 8, -96, -5, -8, -3, -526 };

    System.out.print("Unsorted Array = ");
    for (int x : nums) System.out.print(x + " ");

    selectionSort(nums);
    System.out.println();
    
    System.out.print("Sorted Array using selection sort = ");
    for (int x : nums) System.out.print(x + " ");
  }
}
