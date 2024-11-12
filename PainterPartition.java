public class PainterPartition {

  public static int sum = 0;
  public static int max = 0;

  public static int minimumTime(int[] walls, int painters) {

    for (int i = 0; i < walls.length; i++) {
      max = Math.max(max, walls[i]);
      sum += walls[i];
    }

    int start = max;
    int end = sum;
    int Ans = 0;

    while (start <= end) {
      
      int mid = start + (end - start) / 2;

      int count = 1;
      int time = 0;

      for (int i = 0; i < walls.length; i++) {
        time += walls[i];

        if (time > mid) {
          count++;
          time = walls[i];
        }
      }

      if (count <= painters) {
        Ans = mid;
        end = mid - 1;
      }
      else start = mid + 1;
    }

    return Ans;
  } 

  public static void main(String[] args) {
    int[] nums = { 5, 10, 30, 20, 15 };
    int k = 3;

    System.out.println("Minimum time required by painter to paint the wall woulb be : " + minimumTime(nums, k));
  }
}
