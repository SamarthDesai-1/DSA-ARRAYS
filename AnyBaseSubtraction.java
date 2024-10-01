import java.util.Scanner;

public class AnyBaseSubtraction {

  public static int subtraction(int numOne, int numTwo, int base) {

    int returnVal = 0;
    int carry = 0;
    int p = 1;
    
    while (numTwo > 0) {

      int digitOne = numOne % 10;
      int digitTwo = numTwo % 10;

      numOne /= 10;
      numTwo /= 10;

      /** Main logic */
      int digit = 0;
      digitTwo += carry;

      if (digitTwo >= digitOne) {
        carry = 0;
        digit = digitTwo - digitOne;
      }
      else {
        carry = -1;
        digit = digitTwo + base - digitOne;
      }
      
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

      int ans = subtraction(numOne, numTwo, base);
      System.out.println("Answer : " + ans);
    }
  }
  
}
