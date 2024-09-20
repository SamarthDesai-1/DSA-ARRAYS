import java.util.ArrayList;
import java.util.List;

public class PascalTriangle2 {
  
  public static List<List<Integer>> solution(int n) {
    List<List<Integer>> ans = new ArrayList<>();

    List<Integer> t1 = new ArrayList<>();
    t1.add(1);
    ans.add(t1);

    if (n == 0)
      return ans;

    List<Integer> t2 = new ArrayList<>();
    t2.add(1);
    t2.add(1);
    ans.add(t2);

    if (n == 1)
      return ans;

    for (int i = 1; i < ans.size(); i++) {
      if (ans.size() == n + 1)
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
    int n = 5;
    System.out.println(solution(n).get(n));
  }
  
}
