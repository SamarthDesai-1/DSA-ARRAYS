public class ReverseEachRowOfMatrix {

  /**
   * Reverses a portion of an array in place.
   *
   * @param x     the array to be reversed
   * @param start the starting index of the portion to reverse
   * @param end   the ending index of the portion to reverse
   */

  public static void reverse(int[] x, int start, int end) {

    while (start <= end) {
      int cache = x[start];
      x[start] = x[end];
      x[end] = cache;

      start++;
      end--;
    }
  }

  /**
   * Reverses each row of the given matrix
   * 
   * @param x is the given matrix
   */
  
  public static void reverseEachRow(int[][] x) {
    int row = x.length;

    for (int i = 0; i < row; i++)
      reverse(x[i], 0, x[0].length - 1);
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
        { -9, -6, -5, 15, 25, 36, 91, 96, 25 },
        { 2, 7, 1, 10, 25, 3, 6, 955, 20 },
        { -96, -85, -253, -8522, 25, 36, 74, 20, 28 }
    };

    reverseEachRow(matrix);

    for (int[] i : matrix) {

      for (int j : i) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}