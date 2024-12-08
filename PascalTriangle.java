import java.util.*;

public class PascalTriangle {

  public static ArrayList<ArrayList<Integer>> solution(int n) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

    ArrayList<Integer> t1 = new ArrayList<>();
    t1.add(1);
    ans.add(t1);

    if (n == 1)
      return ans;

    ArrayList<Integer> t2 = new ArrayList<>();
    t2.add(1);
    t2.add(1);
    ans.add(t2);

    if (n == 2)
      return ans;

    for (int i = 1; i < ans.size(); i++) {
      if (ans.size() == n)
        break;

      ArrayList<Integer> temp = ans.get(i);
      ArrayList<Integer> al = new ArrayList<>();

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
