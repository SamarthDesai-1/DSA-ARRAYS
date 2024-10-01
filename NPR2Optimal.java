import java.util.Scanner;

public class NPR2Optimal {

  public static int npr(int n, int r, boolean flag) {
    int output = 1;
    int atLast = flag == true ? n : (n - r);

    for (int i = 1; i <= atLast; i++)
      output *= i;
      
    return output;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter n : ");
      int n = sc.nextInt();
      System.out.print("Enter r : ");
      int r = sc.nextInt();

      int nFact = npr(n, r, true);
      int nMinusR = npr(n, r, false);
      int npr = nFact / nMinusR;

      System.out.println(n + "P" + r + " : " + npr);
    }
  }

}

