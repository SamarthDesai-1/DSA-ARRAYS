import java.util.HashSet;

public class ContainsDuplicate {

  public static boolean solution(int[] nums) {
    HashSet<Integer> set = new HashSet<>();
    for (int x : nums) {
      if (set.contains(x)) return true;
      else set.add(x);
    }

    return false;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 1 };
    System.out.println(solution(nums));
  }
}
