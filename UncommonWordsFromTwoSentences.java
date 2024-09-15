import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UncommonWordsFromTwoSentences {

  public static void processor(HashMap<String, Integer> hm) {
    ArrayList<String> ansList = new ArrayList<>();
    for (Map.Entry<String,Integer> x : hm.entrySet())
      if (x.getValue()<= 1) ansList.add(x.getKey());
    
    System.out.println(ansList);
  }

  public static void main(String[] args) {
    String str1 = "this apple is sweet";
    String str2 = "this apple is sour";
    HashMap<String, Integer> hm = new HashMap<>();

    String[] Array1 = str1.split(" ");
    String[] Array2 = str2.split(" ");

    for (int i = 0; i < Array1.length; i++) {
      if (!hm.containsKey(Array1[i])) hm.put(Array1[i], 1);
      else hm.put(Array1[i], hm.get(Array1[i]) + 1); 
    }
    for (int i = 0; i < Array2.length; i++) {
      if (!hm.containsKey(Array2[i])) hm.put(Array2[i], 1);
      else hm.put(Array2[i], hm.get(Array2[i]) + 1); 
    }

    processor(hm);
  }
}
