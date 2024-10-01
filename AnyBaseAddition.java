import java.util.Scanner;

public class AnyBaseAddition {

  public static int addition(int numOne, int numTwo, int base) {

    int returnVal = 0;
    int p = 1;
    int carry = 0;
    
    /** Main logic */
    while (numOne > 0 || numTwo > 0 || carry > 0) {
      int digitOne = numOne % 10;
      int digitTwo = numTwo % 10;

      numOne /= 10;
      numTwo /= 10;

      int digit = digitOne + digitTwo + carry;
      carry = digit / base;
      digit %= base;

      returnVal += digit * p;
      p *= 10;
    }

    return returnVal;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      
      System.out.print("Enter number one : ");
      int numOne = sc.nextInt();

      System.out.print("Enter number two : ");
      int numTwo = sc.nextInt();

      System.out.print("Enter BASE : ");
      int base = sc.nextInt();

      int ans = addition(numOne, numTwo, base);
      System.out.println("Answer : " + ans);
    }
  }
  
}
