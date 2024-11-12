public class KthElementInASortedMatrixNestedLoops {

  public static int KthSmallestElement(int[][] matrix, int k) {

    int row = matrix.length;
    int col = matrix[0].length;

    for (int i = 0; i < row; i++) {
      
      for (int j = 0; j < col; j++) {
        
        if (--k == 0) return matrix[i][j];
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 5, 6 },
        { 10, 11, 13 },
        { 12, 14, 15 }
    };
    int k = 5;

    System.out.println("Kth element in this array is : " + KthSmallestElement(matrix, k));
  }
}
