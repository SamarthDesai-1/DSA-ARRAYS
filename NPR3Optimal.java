import java.util.Scanner;

public class NPR3Optimal {

  public static int npr(int x) {
    int fact = 1;

    for (int i = 1; i <= x; i++)
      fact *= i;

    return fact;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter n : ");
      int n = sc.nextInt();
      System.out.print("Enter r : ");
      int r = sc.nextInt();

      int nFact = npr(n);
      int nMinusRfact = npr(n - r);

      System.out.println(n + "P" + r + " : " + (nFact / nMinusRfact));
    }
  }

}
