public class BubbleSort {

  public static void main(String[] args) {
    int[] array = { 8, 6, 2, 4, 5, 1, 3, 2 };

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length - 1 - i; j++) {
        if (array[j] > array[j + 1]) {
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
      }
    }
    for (int x : array) System.out.print(x);
  }
}