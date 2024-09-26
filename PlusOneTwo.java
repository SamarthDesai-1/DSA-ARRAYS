import java.util.ArrayList;
import java.util.List;

public class PlusOneTwo {

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
    long ans = 0;
    for (int n : array)
      ans = ans * 10 + n;

    ans++;

    List<Integer> l = new ArrayList<>();
    while (ans > 0) {
      int lastDigit = (int) (ans % 10);
      l.add(lastDigit);
      ans /= 10;
    }

    reverse(l);
    System.out.println(l);

    int[] result = new int[l.size()];
    for (int i = 0; i < result.length; i++) result[i] = l.get(i);

    for (int i : result) System.out.print(i + " ");
  }
}
