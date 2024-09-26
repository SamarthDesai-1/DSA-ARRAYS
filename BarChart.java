public class BarChart {

  public static void main(String[] args) {
    int[] data = { 3, 5, 0, 6, 2 };
    
    int max = data[0];
    for (int i = 1; i < data.length; i++) max = Math.max(max, data[i]);

    for (int i = max; i >= 0; i--) {
      for (int j = 0; j < data.length; j++) {
        if (data[j] >= i) System.out.print("*");
        else System.out.print(" ");
      }
      System.out.println();
    }
  }
}
