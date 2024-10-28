public class CountOccurrencesUsingBinarySearch {

  public static int first = 0;
  public static int second = 0;
  public static int start = 0;
  public static int end;
  public static int finalAns;

  public static void find(int[] nums, int target, char flag) {

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

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

    int[] nums = { 2, 4, 4, 4, 5, 6, 85 };
    int target = 4;

    end = nums.length - 1;

    find(nums, target, 'l');

    start = 0;
    end = nums.length - 1;

    find(nums, target, 'r');

    finalAns = second - first + 1;

    System.out.println("Occurrences of target [ " + target + " ] is : " + finalAns);
  }

}
