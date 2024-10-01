import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PascalTriangle {

  public static List<List<Integer>> solution(int n) {
    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> t1 = new ArrayList<>();
    t1.add(1);
    ans.add(t1);

    if (n == 1)
      return ans;

    List<Integer> t2 = new ArrayList<>();
    t2.add(1);
    t2.add(1);
    ans.add(t2);

    if (n == 2)
      return ans;

    for (int i = 1; i < ans.size(); i++) {
      if (ans.size() == n)
        break;

      List<Integer> temp = ans.get(i);
      List<Integer> al = new ArrayList<>();

      al.add(1);
      for (int j = 1; j < temp.size(); j++) {
        al.add(temp.get(j - 1) + temp.get(j));
      }
      al.add(1);
      ans.add(al);
    }

    return ans;
  }

  public static void main(String[] args) {
    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter N : ");
      int n = input.nextInt();
      System.out.println(solution(n));
    }
  }
  
}
