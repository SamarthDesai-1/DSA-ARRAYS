public class FinalArrayStateAfterKOperationOne {

  public static int getMin(int[] nums) {
    int min = Integer.MAX_VALUE;
    int index = -1;

    for (int i = 0; i < nums.length; i++) {
      if (min > nums[i]) {
        min = nums[i];
        index = i;
      }
    }

    return index;
  }


  public static int[] getFinalState(int[] nums, int multiplier, int k) {

    while (k != 0) {
    
      int minIndex = getMin(nums);

      nums[minIndex] = nums[minIndex] * multiplier;

      k--;
    }

    int[] newArray = nums.clone();

    return newArray;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 1, 3, 5, 6 };
    int multiplier = 2;
    int k = 5;

    for (int x : getFinalState(nums, multiplier, k))
      System.out.print(x + " ");
  }
}