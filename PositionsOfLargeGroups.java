import java.util.ArrayList;

public class PositionsOfLargeGroups {

  public static void main(String[] args) {
    String str = "ffffzx";
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
    System.out.println(mainList);
  }
}
