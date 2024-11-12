public class BookAllocation {

  public static int sum = 0;
  public static int max = 0;

  public static int allocateBook(int[] nums, int m) {

    for (int i = 0; i < nums.length; i++) {
      max = Math.max(max, nums[i]);
      sum += nums[i];
    }

    int start = max;
    int end = sum;
    int Ans = 0;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      int count = 1;
      int page = 0;
      for (int i = 0; i < nums.length; i++) {
        
        page += nums[i];
        if (page > mid) {
          count++;
          page = nums[i];
        }
      }

      if (count <= m) {
        Ans = mid;
        end = mid - 1;
      }
      else start = mid + 1;
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] nums = { 12, 34, 67, 90 }; /** Arrays is not necessary in sorted order */
    int students = 2;

    System.out.println("Minimum papers required for allocation would be : " + allocateBook(nums, students));
  }
}
