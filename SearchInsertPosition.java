public class SearchInsertPosition {

  public static void main(String[] args) {
    int[] array = { 1, 3, 5, 6 };
    int target = 2;
    int n = array.length;
    int position = 0;

    for (int i = 0; i < n; i++) {
      if (target <= array[i]) {
        position = i;
        break;
      }
    }
    if (target > array[n - 1]) position = n;

    System.out.println(position);
  }
}
