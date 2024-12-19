public class SearchElementInTwoDArray {

  /**
   * Searches for a target value within a 2D matrix and returns its coordinates.
   * 
   * @param matrix the 2D array of integers to search within
   * @param target the integer value to search for
   * @return an array containing the row and column indices of the target if
   *         found,
   *         or {-1, -1} if the target is not present in the matrix
   */

  public static int[] search(int[][] matrix, int target) {

    int row = matrix.length;
    int col = matrix[0].length;

    for (int i = 0; i < row; i++)
      for (int j = 0; j < col; j++)
        if (matrix[i][j] == target)
          return new int[] { i, j };

    return new int[] { -1, -1 };
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
        { -9, -6, -5, 15, 25, 36, 91, 96, 25 },
        { 2, 7, 1, 10, 25, 3, 6, 955, 20 },
        { -96, -85, -253, -8522, 25, 36, 74, 20, 28 },
    };

    int target = -253;

    System.out.print("Target " + target + " found at coordinates : ");
    for (int x : search(matrix, target))
      System.out.print(x + " ");
  }
}
