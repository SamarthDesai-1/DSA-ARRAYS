public class FindFirstAndLastIndexBinarySearchCleanCode {

  public static int first = -1;
  public static int second = -1;
  public static int start = 0;
  public static int end = -1; /** Initial value for the end pointer; */

  public static void find(int[] nums, int target, char flag) {

    while (start <= end) {
      int mid = (start + end) / 2;

      if (nums[mid] == target) {

        if (flag == 'l') {
          first = mid;
          end = mid - 1;
        }
        else {
          second = mid;
          start = mid + 1;
        } 
          
      } 
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }
  }


  public static void main(String[] args) {
    int[] nums = { 10, 20, 20, 20, 30, 40, 50, 50, 50, 50, 60, 70, 80, 90, 90, 100 };
    
    int target = 20;
    end = nums.length - 1;

    find(nums, target, 'l');

    start = 0;
    end = nums.length - 1;

    find(nums, target, 'r');

    System.out.print("Indexes : ");
    for (int x : new int[] { first, second }) System.out.print(x + " ");
  }
}
