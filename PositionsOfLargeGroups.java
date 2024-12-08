import java.util.*;

public class PositionsOfLargeGroups {

  public static ArrayList<ArrayList<Integer>> largeGroups(String str) {
    int i = 0;
    int j = 0;
    
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

    while (j < str.length()) {
      
      while (j < str.length() && str.charAt(j) == str.charAt(i)) {
        j++;
      }
      if (j - i >= 3) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(i);
        l.add(j - 1);
        mainList.add(l);
      }
      
      i = j;
      j++;
    }

    return mainList;
  }


  public static void main(String[] args) {
    String str = "ffffzxAAAAA";
    
    System.out.println(largeGroups(str));
  }
}
