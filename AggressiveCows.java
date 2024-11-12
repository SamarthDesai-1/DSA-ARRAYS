import java.util.*;

public class AggressiveCows {

  public static int minimumDistnace(int[] stalls, int k) {

    Arrays.sort(stalls);
    int n = stalls.length;

    int start = 1;
    int end = stalls[n - 1] - stalls[0];
    int Ans = 0;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      int count = 1;
      int position = stalls[0];
      for (int i = 1; i < stalls.length; i++) {
        if (position + mid <= stalls[i]) {
          count++;
          position = stalls[i];
        }
      }

      if (count >= k) {
        Ans = mid;
        start = mid + 1;
      }
      else end = mid - 1;
    }

    return Ans;
  }

  public static void main(String[] args) {
    int[] stalls = { 4, 8, 9, 1, 2 };
    int k = 3;

    System.out.println("Minimum distance between K cows will be : " + minimumDistnace(stalls, k));
  }
}
