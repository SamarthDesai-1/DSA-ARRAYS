import java.util.*;

public class ThreeSum {
 
  public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {

    HashSet<ArrayList<Integer>> set = new HashSet<>();
    Arrays.sort(nums);

    for (int i = 0; i < nums.length; i++) {
      
      for (int j = i + 1; j < nums.length; j++) {
        
        ArrayList<Integer> l = new ArrayList<>();

        for (int k = j + 1; k < nums.length; k++) {

          if (nums[i] + nums[j] + nums[k] == 0) {
            l.add(nums[i]);
            l.add(nums[j]);
            l.add(nums[k]);

            set.add(l);
          }
        }
      }
    }

    ArrayList<ArrayList<Integer>> output = new ArrayList<>();

    for (ArrayList<Integer> list : set) 
      output.add(list);

    return output;
  }

  public static void main(String[] args) {
    int[] nums = { -1, 0, 1, 2, -1, -4 };

    System.out.println("All unique triplets whose sum is zero is : " + threeSum(nums));
  }
}
