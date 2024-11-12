import java.util.*;

public class SearchInATwoDmatrix {

  public static Vector<Integer> search(int[][] matrix, int target) {
    Vector<Integer> vector = new Vector<>();

    int row = matrix.length;
    int col = matrix[0].length;

    int start = 0;
    int end = (row * col) - 1;
    
    while (start <= end) {
      
      int mid = start + (end - start) / 2;
      
      int rowIndex = mid / col;
      int colIndex = mid % col;
      
      if (matrix[rowIndex][colIndex] == target) {
        vector.add(rowIndex);
        vector.add(colIndex);
        return vector;
      }
      else if (matrix[rowIndex][colIndex] > target) end = mid - 1;
      else start = mid + 1;
    }

    vector.add(-1);
    vector.add(-1);

    return vector;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 2, 6, 10, 14, 18 },
        { 20, 24, 27, 29, 38 },
        { 47, 52, 78, 93, 102 },
        { 108, 111, 200, 218, 320 }
    };
    int target = 52;

    System.out.println("Target found at coordinates : " + search(matrix, target));
  }
}
