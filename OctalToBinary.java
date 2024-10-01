import java.util.Scanner;

public class OctalToBinary {

  public static int octalToDecimal(int octal) {

    int temp = octal;
    int decimal = 0;
    int placeVal = 0;

    while (temp > 0) {
      int remainder = temp % 10;
      temp /= 10;

      decimal = decimal + remainder * (int) Math.pow(8, placeVal++);
    }

    return decimal;
  }

  public static String decimalToBinary(int binary) {

    int temp = binary;
    StringBuilder sb = new StringBuilder("");

    while (temp > 0) {
      int remainder = temp % 2;
      temp /= 2;

      sb.append(remainder);
    }

    return sb.reverse().toString();
  }
  
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter OCTAL number : ");
      int octal = sc.nextInt();

      int decimal = octalToDecimal(octal);
      String binaryEquivalentOfOctalBase = decimalToBinary(decimal);

      System.out.println("Binary number of octal " + octal + " is : " + binaryEquivalentOfOctalBase);
    }
  }
}