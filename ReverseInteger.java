import java.util.*;

public class ReverseInteger {

  public static int reverse(int n) {

    boolean isNegative = n < 0 ? true : false;
    long reverse = 0;

    if (isNegative == true) 
      n *= -1;

    while (n > 0) {
      int lastDigit = n % 10;
      reverse = reverse * 10 + lastDigit;
      n /= 10;
    }

    if (isNegative)
      reverse *= -1;

    if (reverse > Integer.MAX_VALUE || reverse < Integer.MIN_VALUE) 
      return 0;

    return (int) reverse;
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
      
      System.out.print("Enter N : ");
      int n = input.nextInt();

      System.out.println("Reversed integer is : " + reverse(n));
    }
  }
}