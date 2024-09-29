public class PrintAllSubArrays {

  public static void subArrays(int[] nums) {
    
    System.out.println("Subarrays");
    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i; j < nums.length; j++) {
        
        for (int k = i; k <= j; k++) {
          System.out.print(nums[k] + " ");
        }
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    subArrays(nums);
  }

}
