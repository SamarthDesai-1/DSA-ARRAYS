import java.util.Arrays;

class Solution {

  public String solution(int[] nums) {
    String[] numStrings = new String[nums.length];
    for (int i = 0; i < numStrings.length; i++)
      numStrings[i] = nums[i] + "";

    Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));
    if (numStrings[0].equals("0"))
      return "0";

    StringBuilder sb = new StringBuilder("");
    for (String str : numStrings)
      sb.append(str);

    return sb.toString();
  }
}

public class LargestNumber {

  public static void main(String[] args) {
    int[] nums = { 3, 30, 34, 5, 9, 85, 9 };
    Solution obj = new Solution();

    System.out.println(obj.solution(nums));
  }
}
