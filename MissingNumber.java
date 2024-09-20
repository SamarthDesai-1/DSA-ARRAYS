public class MissingNumber {

  public static void main(String[] args) {
    int[] nums = { 0, 1 };
    int n = nums.length;

    int totalSum = 0;
    for (int i = 0; i < n; i++) totalSum += nums[i];

    System.out.println("Missing Number : " + (((n * (n + 1)) / 2) - totalSum));
  }

}
