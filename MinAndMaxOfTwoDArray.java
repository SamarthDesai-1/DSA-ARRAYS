public class MinAndMaxOfTwoDArray {

  /**
   * This function takes a 2D array and a String flag as arguments. Depending on
   * the flag, it returns either the minimum or the maximum value from the array.
   * If flag is "mi", it returns the minimum value. If flag is "ma", it returns
   * the maximum value.
   * 
   * @param x    - the 2D array
   * @param flag - the String flag
   * @return the minimum or maximum value from the array
   */

  public static int minAndMaxOfArray(int[][] x, String flag) {

    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int row = x.length;
    int col = x[0].length;

    for (int i = 0; i < row; i++) {

      for (int j = 0; j < col; j++) {
        if (flag == "mi")
          min = Math.min(min, x[i][j]);
        else if (flag == "ma")
          max = Math.max(max, x[i][j]);
      }
    }

    return flag == "ma" ? max : min;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 3, 4, 5, 6, 7, 8, 9 },
        { -9, -6, -5, 15, 25, 36, 91, 96, 25 },
        { 2, 7, 1, 10, 25, 3, 6, 955, 20 },
        { -96, -85, -253, -8522, 25, 36, 74, 20, 28 }
    };

    System.out.println("Maximum from array is : " + minAndMaxOfArray(matrix, "ma"));
    System.out.println("Minimum from array is : " + minAndMaxOfArray(matrix, "mi"));
  }
}
