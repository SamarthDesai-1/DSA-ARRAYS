import java.util.*; 

public class AddDigits {

  public static int size(int n) {

    int count = 0;
    while (n > 0) {
      count++;
      n /= 10;
    }

    return count;
  }

  public static int addDigits(int n) {

    if (n == 0) 
      return n;

    int sum = 00;
    while (true) {

      while (n > 0) {
        sum = sum + (n % 10);
        n /= 10;
      }

      System.out.println("Sum : " + sum);

      if (size(sum) == 1)
        return sum;

      n = sum;
      sum = 0;

    }
  }

  public static void main(String[] args) {
    

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter N : ");
      int n = input.nextInt();

      System.out.println("Add digits upto single is : " + addDigits(n));
    }
  }
  
}
