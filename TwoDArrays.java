public class TwoDArrays {

  /**
   * Prints the elements of a 2D integer array in matrix form.
   *
   * @param matrix The 2D array to be printed, where each row is printed on a new
   *               line.
   */

  public static void printMatrix(int[][] matrix) {
    int row = matrix.length;
    int col = matrix[0].length;

    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {

    int[][] matrix = {
        { 1, 2, 3, 4, 5 },
        { 6, 7, 8, 9, 0 },
        { 10, 11, 12, 13, 14 },
        { 15, 16, 17, 18, 19 }
    };

    printMatrix(matrix);
  }
}
