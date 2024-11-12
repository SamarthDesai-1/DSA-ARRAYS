import java.util.Scanner;

public class KthElementInASortedMatrix {

  public static int KthSmallestElement(int[][] matrix, int k) {

    int cache = k;
    long isExists = 0;
    int row = matrix.length;

    for (int i = 0; i < row; i++) {
      
      isExists += matrix[i].length;

      if (isExists >= k) return matrix[i][cache - 1];

      cache -= matrix[i].length;
    }
    
    return -1;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 5, 6 },
        { 10, 11, 13 },
        { 12, 13, 15 }
    };

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter K : ");
      int k = input.nextInt();

      System.out.println("Kth element in this array is : " + KthSmallestElement(matrix, k));
    }
  }
}
