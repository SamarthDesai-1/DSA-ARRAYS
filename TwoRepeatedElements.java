import java.util.HashMap;

public class TwoRepeatedElements {

  /**
   * Given an array of size n. Find two elements in the array that repeats.
   * 
   * @param nums - the array containing the elements
   * @param n    - the size of the array
   * @return an array of size 2 containing the two elements that repeats
   */

  public static int[] twoRepeatedElements(int[] nums, int n) {

    HashMap<Integer, int[]> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {

      if (!map.containsKey(nums[i]))
        map.put(nums[i], new int[] { 1, i });
      else
        map.put(nums[i], new int[] { map.get(nums[i])[0] + 1, i });
    }

    int first = -1;
    int second = 0;
    char flag = ' ';
    for (int x : map.keySet()) {
      int[] cache = map.get(x);

      for (int i = 0; i < 1; i++) {

        if (cache[0] == 2) {
          if (first == -1)
            first = cache[1];

          else {
            second = cache[1];
            if (first < second) {
              flag = 'f';
              second = cache[1];
            } else if (first > second)
              second = cache[1];
          }
        }
      }
    }

    if (flag == 'f')
      return new int[] { nums[first], nums[second] };
    else
      return new int[] { nums[second], nums[first] };
  }

  public static void main(String[] args) {
    int[] nums = { 1, 2, 1, 3, 4, 3 };
    int n = 4;

    for (int x : twoRepeatedElements(nums, n))
      System.out.print(x + " ");
  }
}