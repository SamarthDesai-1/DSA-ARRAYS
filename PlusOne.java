import java.util.ArrayList;
import java.util.List;

public class PlusOne {

  public static void reverse(List<Integer> l) {
    int left = 0;
    int right = l.size() - 1;
    while (left < right) {
      int temp = l.get(right);
      l.set(right, l.get(left));
      l.set(left, temp);
      left++;
      right--;
    }
  }

  public static void main(String[] args) {
    int[] array = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };

    int ans = array[0] * 10;
    for (int i = 1; i < array.length; i++) {
      ans = ans * 10 + array[i];
    }
    System.out.println(ans);
    ans++;
    System.out.println(ans);

    List<Integer> l = new ArrayList<>();

    while (ans > 0) {
      int lastDigit = ans % 10;
      l.add(lastDigit);
      ans /= 10;
    }

    reverse(l);

    int[] result = new int[l.size()];
    for (int i = 0; i < l.size(); i++) {
      result[i] = l.get(i);
    }

    for (int x : result) {
      System.out.print(x + " ");
    }

  }
}
