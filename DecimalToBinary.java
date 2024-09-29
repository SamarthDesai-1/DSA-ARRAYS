import java.util.Scanner;

public class DecimalToBinary {

  public static String toBinary(int n) {
    int temp = n;
    StringBuilder binary = new StringBuilder("");

    while (temp > 0) {
      int remainder = temp % 2;
      temp /= 2;

      binary.append(remainder);
    }

    return binary.reverse().toString();
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      
      System.out.print("Enter number to convert into binary : ");
      int n = sc.nextInt();

      System.out.println("Binary number is : " + toBinary(n));
    }
  }

}
