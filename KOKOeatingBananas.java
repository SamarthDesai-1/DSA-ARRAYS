public class KOKOeatingBananas {

  public static int minEatingSpeed(int[] piles, int h) {

    int start = 0, end = 0, mid, minSpeed = piles[0], n = piles.length;
    long sum = 0;

    for (int i = 0; i < n; i++) {
      sum += piles[i];
      end = Math.max(end, piles[i]);
    }
    start = (int) (sum / h);

    start = start == 0 ? 1 : start;

    while (start <= end) {
      mid = start + (end - start) / 2;

      int totalTime = 0;
      for (int i = 0; i < n; i++) {
        totalTime += piles[i] / mid;
        if (piles[i] % mid != 0) totalTime++;
      }

      if (totalTime > h) start = mid + 1;
      else {
        minSpeed = mid;
        end = mid - 1;
      }
    }

    return minSpeed;
  }

  public static void main(String[] args) {
    int[] piles = { 3, 6, 11, 7 };
    int h = 8;

    System.out.println("Minimum speed of KOKO should be at least : " + minEatingSpeed(piles, h) + " banana per hour");
  }
}
