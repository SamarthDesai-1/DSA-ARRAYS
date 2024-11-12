import java.util.Vector;

public class SearchInaSortedRowColWise {

  public static Vector<Integer> search(int[][] matrix, int target) {
    
    Vector<Integer> indexes = new Vector<>();
    int row = matrix.length;
    int col = matrix[0].length;
    int i = 0;
    int j = col - 1;

    while (i < row && j >= 0) {
      
      if (matrix[i][j] == target) {
        indexes.add(i);
        indexes.add(j);
        return indexes;
      }
      else if (matrix[i][j] < target) i++;
      else j--;
    }

    indexes.add(-1);
    indexes.add(-1);

    return indexes;
  }

  public static void main(String[] args) {
    int[][] matrix = {

        { 4, 8, 15, 25, 60 },
        { 18, 22, 26, 42, 80 },
        { 36, 40, 45, 68, 104 },
        { 48, 50, 72, 83, 130 },
        { 70, 99, 114, 128, 170 }
    };
    int target = 50;

    System.out.println("Target found at coordinates : " + search(matrix, target));
  }
}
