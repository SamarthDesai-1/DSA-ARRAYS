public class ValidPerfectSquare {

  public static int isValidSquare(int n) {

    int left = 0;
    int right = n;

    while (left <= right) {
      int mid = left + (right - left) / 2;
      long square = (long) Math.pow(mid, 2);

      if (square == n) 
        return mid;

      else if (square > n) 
        right = mid - 1;
      else 
        left = mid + 1;
    }

    return -1;
  }

  public static void main(String[] args) {
    int n = 64;

    System.out.println(n + " square root is : " + isValidSquare(n));
  }
}
