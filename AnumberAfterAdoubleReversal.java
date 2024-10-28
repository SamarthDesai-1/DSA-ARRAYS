import java.util.*;

public class AnumberAfterAdoubleReversal {

  public static int reverse(int n) {
    int reverse = 0;

    while (n > 0) {
      int lastDigit = n % 10;
      reverse = reverse * 10 + lastDigit;
      n /= 10;
    }

    return reverse;
  }

  public static boolean isDoubleReversal(int n) {
    int cache = n;

    return cache == reverse(reverse(n)) ? true : false;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter N : ");
      int n = input.nextInt();

      System.out.println("Output : " + isDoubleReversal(n));
    }
  }  
}
