public class FindSecondOccurrenceOfElementArray {

  public static int secondOccurrence = -1;

  public static void secondOccurrence(int[] nums, int target) {

    int start = 0;
    int end = nums.length - 1;

    while (start <= end) {
      
      int mid = (start + end) / 2;
      if (nums[mid] == target) {
        secondOccurrence = mid;
        start = mid + 1;
      }
      else if (nums[mid] > target) end = mid - 1;
      else start = mid + 1;
    }

    System.out.println("Second occurrenec of [ " + target + " ] found at index : " + secondOccurrence);
  }

  public static void main(String[] args) {
    int[] nums = { 5, 7, 7, 7, 8, 8, 8, 8, 10 };
    int target = 8;

    secondOccurrence(nums, target); 
  }
}
