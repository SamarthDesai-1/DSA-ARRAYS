public class SquareOfSortedArrayApproachTwo {

  public static int[] squareSortedArray(int[] nums) {

    int n = nums.length;
    int left = 0;
    int right = n - 1;
    int index = n - 1;
    int[] result = new int[n];

    while (left <= right) {
      int Lsquare = (int) Math.pow(nums[left], 2);
      int Rsquare = (int) Math.pow(nums[right], 2);

      if (Lsquare > Rsquare) {
        result[index--] = Lsquare;
        left++;
      }
      else {
        result[index--] = Rsquare;
        right--;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] nums = { -4, -1, 0, 1, 3 };

    for (int x : squareSortedArray(nums))
      System.out.print(x + " ");
  }
}
