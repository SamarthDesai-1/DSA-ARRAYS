import java.util.Scanner;

public class CountDigitFrequency {

  public static int frequency(int n, int key) {

    int temp = n;
    int frequency = 0;
    while (temp > 0) {
      int lastDigit = temp % 10;

      if (lastDigit == key) frequency++;
      temp /= 10; 
    }
    
    return frequency != 0 ? frequency : 0;
  }

  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {

      System.out.print("Enter N : ");
      int n = sc.nextInt();
      System.out.print("Enter KEY : ");
      int key = sc.nextInt();

      System.out.println("Output : " + frequency(n, key));
    }
  }
  
}
