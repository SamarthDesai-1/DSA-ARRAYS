public class SumOfSquareNumbers {

  public static boolean sumOfSquare(int n) {
    int left = 0;
    int right = (int) Math.sqrt(n);

    while (left <= right) {
      long sum = (long) Math.pow(left, 2) + (long) Math.pow(right, 2);

      if (sum == n)
        return true;
      
      if (sum < n) 
        left++;
      else 
        right--;
    }

    return false;
  }

  public static void main(String[] args) {
    int n = 49;

    System.out.println("Sum of square for any two number that add upto " + n + " is exists : " + sumOfSquare(n));
  }
}
