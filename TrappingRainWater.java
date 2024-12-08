public class TrappingRainWater {

  public static int maxTrapWater(int[] nums) {

    int trapWater = 0;
    int maxLeft = 0;
    int maxRight = 0;
    int maxHeight = nums[0];
    int index = 0;

    for (int i = 1; i < nums.length; i++) {

      if (maxHeight < nums[i]) {
        maxHeight = nums[i];
        index = i;
      }
    }

    /** Solve left part */
    
    for (int i = 0; i < index; i++) {
      if (maxLeft > nums[i]) 
        trapWater += maxLeft - nums[i];
      else 
        maxLeft = nums[i];
    }

    /** Solve right part */

    for (int i = nums.length - 1; i >= index; i--) {
      if (maxRight > nums[i])
        trapWater += maxRight - nums[i];
      else 
        maxRight = nums[i];
    }

    return trapWater;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 };


    System.out.println(maxTrapWater(nums)); 
  }
}
