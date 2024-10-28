public class KthMissingPositiveInteger {

  public static int findKthInteger(int[] nums, int k) {

    int start = 0;
    int end = nums.length - 1;
    int Ans = -1;
    
    while (start <= end) {

      int mid = start + (end - start) / 2;

      if (nums[mid] - mid - 1 >= k) {
        Ans = mid;
        end = mid - 1;
      } 
      else start = mid + 1;
    }

    return Ans == -1 ? nums.length + k : Ans + k;
  }

  public static void main(String[] args) {

    int[] nums = { 1, 2, 3, 4 };
    int k = 2;

    System.out.println("Kth missing positive integer is : " + findKthInteger(nums, k));
  }
}
