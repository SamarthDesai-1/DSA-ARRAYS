public class RowWithMaxSum {

  /**
   * Given a matrix of size M x N, find the row which has the maximum sum.
   * 
   * @param x The given matrix.
   * @return The index of the row with the maximum sum.
   */

  public static int rowWithMaxSum(int[][] x) {
    int row = x.length;
    int col = x[0].length;
    int index = -1;

    int max = Integer.MIN_VALUE;

    for (int i = 0; i < row; i++) {

      int sum = 0;
      for (int j = 0; j < col; j++)
        sum += x[i][j];

      if (max < sum) {
        index = i;
        max = sum;
      }
    }

    return index;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
        { -9, -6, -5, 15, 25, 36, 91, 96, 25 },
        { 2, 7, 1, 10, 25, 3, 6, 955, 20 },
        { -96, -85, -253, -8522, 25, 36, 74, 20, 28 },
    };

    System.out.println("Maximum sum containing row index is : " + rowWithMaxSum(matrix));
  }
}
