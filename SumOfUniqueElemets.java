import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SumOfUniqueElemets {

  static class Elements {

    int[] nums = new int[5];

    public int sumOfUnique() {
      int sum = 0;

      HashMap<Integer, Integer> map = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
        if (!map.containsKey(nums[i]))
          map.put(nums[i], 1);
        else
          map.put(nums[i], map.get(nums[i]) + 1);
      }

      for (Map.Entry<Integer, Integer> x : map.entrySet()) {
        if (x.getValue() == 1)
          sum += x.getKey();
      }

      return sum;
    }

    public void inputArray() {

      try (Scanner sc = new Scanner(System.in)) {

        for (int i = 0; i < nums.length; i++) {
          System.out.print("Enter element " + (i + 1) + " : ");
          nums[i] = sc.nextInt();
        }
      }
    }
  }

  public static void main(String[] args) {

    Elements element = new Elements();
    element.inputArray();

    System.out.println("Sum : " + element.sumOfUnique());

  }
}