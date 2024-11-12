public class ShipPackages {

  public static int sum = 0;
  public static int max = 0;

  public static int minimumWeight(int[] nums, int days) {

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
      int weights = 0;

      for (int i = 0; i < nums.length; i++) {
        weights += nums[i];

        if (weights > mid) {
          count++;
          weights = nums[i];
        }
      }

      if (count <= days) {
        Ans = mid;
        end = mid - 1;
      }
      else start = mid + 1;
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] nums = { 3, 2, 2, 4, 1, 4 };
    int days = 3;

    System.out.println("Minimum weight of ship for transport all goods would be : " + minimumWeight(nums, days));
  }

}
