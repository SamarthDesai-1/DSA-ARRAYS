import java.util.Scanner;

public class NPR {

  public static int npr(int n, int r) {
    int nFact = 1;

    for (int i = 1; i <= n; i++)
      nFact *= i;

    int nMinusR = 1;
    for (int i = 1; i <= (n - r); i++)
      nMinusR *= i;

    return nFact / nMinusR;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter n : ");
      int n = sc.nextInt();
      System.out.print("Enter r : ");
      int r = sc.nextInt();

      System.out.println(n + "P" + r + " : " + npr(n, r));
    }
  }

}
