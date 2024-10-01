import java.util.Scanner;

public class SqrtBruteForce {

  public static int solution(int n) {

    for (int i = 1; i <= (n / 2); i++) {
      int root = (int) Math.pow(i, 2);

      if (root == n) return i;

    }

    return 0;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter spuare root : ");
      int squareRoot = input.nextInt();

      System.out.println(solution(squareRoot));
    }
  }
  
}
