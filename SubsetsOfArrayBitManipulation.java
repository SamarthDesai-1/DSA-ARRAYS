import java.util.ArrayList;

public class SubsetsOfArrayBitManipulation {

  public static ArrayList<ArrayList<Integer>> subsets(int[] nums) {

    int limit = (int) Math.pow(2, nums.length);
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    for (int i = 0; i < limit; i++) {

      /** convert i to binary and use 0's and 1's */
      int temp = i;
      ArrayList<Integer> list = new ArrayList<>();

      for (int j = nums.length - 1; j >= 0; j--) {
        int remainder = temp % 2;
        temp /= 2;

        if (remainder != 0) {
          list.add(nums[j]);
        } 
      }

      mainList.add(list);
    }

    return mainList;
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 3, 4 };
    System.out.println(subsets(nums));
  }

}
