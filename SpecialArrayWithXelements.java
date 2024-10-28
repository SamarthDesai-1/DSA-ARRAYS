public class SpecialArrayWithXelements {

  public static int isSpecialArray(int[] nums) {

    int x = 0;
    while (x <= 100) {

      int count = 0;

      for (int i = 0; i < nums.length; i++) {
        if (nums[i] >= x)
          count++;
      }

      if (x == count)
        return x;

      x++;
    }

    return -1;
  }

  public static void main(String[] args) {
    int[] nums = { 0, 0 };

    System.out.println("Special element from this array is : " + isSpecialArray(nums));
  }
}
