import java.util.Scanner;

public class ThousandSeperator {

  public static String looper(int n, boolean flag) {
    if (n == 0) return "0";
    StringBuilder sb = new StringBuilder();

    int count = 0;
    while (n > 0) {
      if (flag == true && count == 3) {
        sb.append(".");
        count = 0;
      }
      if (flag == true) count++;

      sb.append(n % 10);
      n /= 10;
    }
    return sb.reverse().toString();
  }


  public static String thousandSeperator(int n) {
    if (n < 1000) return looper(n, false);
    return looper(n, true);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter number : ");
      int n = sc.nextInt();
      System.out.println("Thousand seperator of " + n + " -> " + thousandSeperator(n));
    }
  }
}
