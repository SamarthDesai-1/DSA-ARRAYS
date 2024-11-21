public class PlusOne {

  public static int[] plusOne(int[] nums) {

    for (int i = nums.length - 1; i >= 0; i--) {
      
      if (nums[i] < 9) {
        nums[i]++;
        return nums;
      }
      else nums[i] = 0;
    }

    int[] output = new int[nums.length + 1];
    output[0]++;
    return output;
  }

  public static void main(String[] args) {
    int[] array = { 3, 9, 9, 9 };

    System.out.print("Plus one to array is : ");
    for (int x : plusOne(array)) System.out.print(x + " ");
  }
}