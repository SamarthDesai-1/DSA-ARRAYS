import java.util.*;

public class SetMismatch {

  public static int[] missingValue(int[] nums) {
    int n = nums.length;

    int sumOfNterms = n * (n + 1) / 2;
    int duplicateNumber = 0;

    int arraySum = 0;
    for (int x : nums)
      arraySum += x;

    HashSet<Integer> set = new HashSet<>();

    for (int x : nums) {
      if (!set.contains(x)) 
        set.add(x);
      else {
        duplicateNumber = x;
        break;
      }
    }

    return new int[] { duplicateNumber, sumOfNterms - (arraySum - duplicateNumber) };
  }

  public static void main(String[] args) {
    int[] nums = { 1, 1 };

    for (int x : missingValue(nums))
      System.out.print(x + " ");
  }
}
