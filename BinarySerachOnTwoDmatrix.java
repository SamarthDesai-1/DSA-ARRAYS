import java.util.*;

public class BinarySerachOnTwoDmatrix {

  public static Vector<Integer> binarySearch(int[][] matrix, int target) {

    Vector<Integer> indexes = new Vector<>();
    int row = matrix.length;
    int col = matrix[0].length;

    for (int i = 0; i < row; i++) {
      
      if (matrix[i][0] <= target && target <= matrix[i][col - 1]) {

        int start = 0;
        int end = col - 1;

        while (start <= end) {
          
          int mid = start + (end - start) / 2;
          if (matrix[i][mid] == target) {
            indexes.add(i);
            indexes.add(mid);
            return indexes;
          }
          else if (matrix[i][mid] > target) end = mid - 1;
          else start = mid + 1;
        }
      }
    }

    indexes.add(-1);
    indexes.add(-1);

    return indexes;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 2, 6, 10, 14, 18 },
        { 20, 24, 27, 29, 38 },
        { 47, 52, 78, 93, 102 },
        { 108, 111, 200, 218, 320 }
    };
    int target = 52;

    System.out.println("Target " + target + " found at positon : " + binarySearch(matrix, target));
  }
}
