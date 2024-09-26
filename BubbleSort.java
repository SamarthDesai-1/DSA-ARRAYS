class Sort {

  public void sort(int[] nums) {
    int n = nums.length;
    boolean isSwapped;
    for (int i = 0; i < n - 1; i++) {

      isSwapped = false;
      
      for (int j = 0; j < n - 1 - i; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j + 1];
          nums[j + 1] = nums[j];
          nums[j] = temp;
          isSwapped = true;
        }
      }

      if (!isSwapped) break;
    }
  }
}

public class BubbleSort {

  public static void main(String[] args) {
    int[] array = { 8, 6, 2, 4, 5, 1, 3, 2 };
    Sort foo = new Sort();
    foo.sort(array);

    for (int x : array) System.out.print(x + " "); 
  }
}