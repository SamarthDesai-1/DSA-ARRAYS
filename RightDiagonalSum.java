public class RightDiagonalSum {

  /**
   * Returns the sum of the elements of the right diagonal of a matrix x.
   * 
   * @param x a two-dimensional array of integers
   * @return the sum of the elements of the right diagonal of x
   */

  public static int rightDiagonalSum(int[][] x) {
    int sum = 0;

    int row = x.length;
    int col = x[0].length - 1;

    for (int i = 0; i < row; i++)
      sum += x[i][col--];

    return sum;
  }

  public static void main(String[] args) {
    int[][] x = {
        { 1, 2, 3 }, { 4, 6, 6 }, { 7, 8, 9 }
    };

    System.out.println("Right diagonal sum is : " + rightDiagonalSum(x));
  }
}