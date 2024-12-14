import java.util.HashSet;

public class IndexOfExtraElement {

  /**
   * Finds the index of the extra element in array 'a' that does not exist in
   * array 'b'.
   *
   * @param a an array of integers where one element is extra compared to array
   *          'b'
   * @param b an array of integers that is a subset of array 'a'
   * @return the index of the extra element in array 'a'
   */

  public static int extraElementIndex(int[] a, int[] b) {
    HashSet<Integer> set = new HashSet<>();

    for (int x : b)
      set.add(x);

    int index = 0;
    for (int i = 0; i < a.length; i++) {
      if (!set.contains(a[i])) {
        index = i;
        break;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int[] a = { 2, 4, 6, 8, 9, 10, 12 };
    int[] b = { 2, 4, 6, 8, 10, 12 };

    System.out.println("Extra element index is : " + extraElementIndex(a, b));
  }
}
