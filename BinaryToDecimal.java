import java.util.Scanner;

public class BinaryToDecimal {

  public static int toDecimal(int n) {

    int temp = n;
    int placeVal = 0;
    int decimal = 0;

    while (temp > 0) {
      int remainder = temp % 10;
      temp /= 10;

      decimal = decimal + remainder * (int) Math.pow(2, placeVal++);
    }

    return decimal;
  }

  public static void main(String[] args) {
     try (Scanner sc = new Scanner(System.in)) {
      
      System.out.print("Enter number to convert into decimal : ");
      int n = sc.nextInt();

      System.out.println("Binary number is : " + toDecimal(n));
    }
  }
  
}
