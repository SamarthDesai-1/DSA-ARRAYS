import java.util.*;

public class SqrtBinarySearch {

  public static int squareRoot(int n) {

    int start = 0;
    int end = n;
    int potentialAnswer = 0;

    while (start <= end) {
      int mid = (start + end) / 2;

      int square = (int) Math.pow(mid, 2);

      if (square == n) return mid;
      else if (square > n) end = mid - 1;
      else {
        potentialAnswer = mid;
        start = mid + 1;
      }
    }

    return potentialAnswer;
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter square of a number : ");
      int n = input.nextInt();

      System.out.println("Square root of " + n + " is : " + squareRoot(n));
    }
  }
}
