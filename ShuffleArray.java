public class ShuffleArray {

  public static int[] shuffle(int[] nums, int n) {

    int[] output = new int[nums.length];
    int x1 = 0;
    int y1 = n;
    int x2 = 0;
    int y2 = 1;

    while (y2 < nums.length) {
      output[x2] = nums[x1];
      output[y2] = nums[y1];

      x1++;
      y1++;
      x2 += 2;
      y2 += 2;
    }

    return output;
  }

  public static void main(String[] args) {
    int[] nums = { 2, 5, 1, 3, 4, 7 };
    int n = 3;

    System.out.print("Shuffled array : ");
    for (int x : shuffle(nums, n)) System.out.print(x + " ");
  }
}
