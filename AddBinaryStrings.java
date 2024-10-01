import java.util.*;

public class AddBinaryStrings {

  public static String addBinary(String numOne, String numTwo) {

    int carry = 0;
    StringBuffer buffer = new StringBuffer("");

    /** Logic here */
    int i = numOne.length() - 1;
    int j = numTwo.length() - 1;

    while (i >= 0 || j >= 0 || carry > 0) {
      
      int digitOne = i >= 0 ? numOne.charAt(i) - '0' : 0; 
      int digitTwo = j >= 0 ? numTwo.charAt(j) - '0' : 0;

      int digit = digitOne + digitTwo + carry;
      carry = digit / 2;
      digit %= 2;

      buffer.append(digit);
      i--;
      j--;
    }

    return buffer.reverse().toString();
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter number One : ");
      String numOne = input.next();
      System.out.print("Enter number Two : ");
      String numTwo = input.next();

      System.out.println("Addition answer : " + addBinary(numOne, numTwo));
    }
  }
  
}
