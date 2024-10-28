public class Search2DMatrix {

  public static boolean matrixSearch(int[][] matrix, int target) {
    boolean result = false;

    for (int i = 0; i < matrix.length; i++) {

      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == target)
          return !result;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[][] matrix = {
      { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 60 }
    };
    int target = 3;

    System.out.println(target + " is founnd status : " + matrixSearch(matrix, target));
  }

}
