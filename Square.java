import java.util.Scanner;

public class Square {

  public static int square(int n) {
    return (int) Math.pow(n, 2);
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter number : ");
      int n = sc.nextInt();

      System.out.println("Output : " + square(n));
    }
    
  }
}