public class LeftDiagonalSum {

  /**
   * Returns the sum of the elements of the left diagonal of the 2D array.
   *
   * @param x the 2D array
   * @return the sum of the elements of the left diagonal
   */
  
  public static int leftDiagonalSum(int[][] x) {
    int sum = 0;
    int row = x.length;

    for (int i = 0; i < row; i++)
      sum += x[i][i];

    return sum;
  }

  public static void main(String[] args) {
    int[][] x = {
        { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }
    };

    System.out.println("Left diagonal sum is : " + leftDiagonalSum(x));
  }
}