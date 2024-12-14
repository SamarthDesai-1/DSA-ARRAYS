public class SearchInsertPositionBinarySearch {

  public static int search(int[] nums, int target) {

    int position = nums.length;

    int left = 0;
    int right = nums.length - 1;
  
    while (left <= right) {
      
      int mid = (left + right) / 2;
      if (nums[mid] == target) {
        position = mid;
        break;
      }
      else if (nums[mid] > target) {
        position = mid;
        right = mid - 1;
      } 
      else left = mid + 1; 

    }

    return position;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 6, 9, 10, 15, 19, 26 };
    int target = 11;

    System.out.println("Correct insert positon : " + search(nums, target));
  }
}
