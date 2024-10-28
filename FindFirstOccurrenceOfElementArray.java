public class FindFirstOccurrenceOfElementArray {

  public static int firstOccurrence = -1;

  public static void firstOccurrence(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      
      int mid = (start + end) / 2;

      if (nums[mid] == target) {
        firstOccurrence = mid;
        end = mid - 1;
      }
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    System.out.println("First occurrenec of [ " + target + " ] found at index : " + firstOccurrence);
  }

  public static void main(String[] args) {

    int[] nums = { 5, 7, 7, 8, 8, 10 };
    int target = 8;

    firstOccurrence(nums, target);
  }
}
