public class ContainerWithMostWaterTwoPointer {

  public static int maxWater(int[] nums) {

    int left = 0;
    int right = nums.length - 1;
    int maxWater = 0;

    while (left <= right) {

      int height = Math.min(nums[left], nums[right]);
      int width = right - left;
      
      maxWater = Math.max(height * width, maxWater);

      if (nums[left] < nums[right]) 
        left++;
      else 
        right--;
    }

    return maxWater;
  }

  public static void main(String[] args) {
    int[] bars = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

    System.out.println("Maximum water capacity to store water is : " + maxWater(bars));
  }
}
