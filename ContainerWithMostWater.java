public class ContainerWithMostWater {

  public static int maxWater(int[] nums) {
    int maxWater = 0;
    
    for (int i = 0; i < nums.length; i++) {

      for (int j = i + 1; j < nums.length; j++) {
        
        int height = Math.min(nums[i], nums[j]);
        int width = j - i;

        maxWater = Math.max(maxWater, height * width);

      }
    }

    return maxWater;
  }

  public static void main(String[] args) {
    int[] bars = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

    System.out.println("Maximum water capacity to store water is : " + maxWater(bars));
  }
}
