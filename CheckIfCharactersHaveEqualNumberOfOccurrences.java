import java.util.*;

public class CheckIfCharactersHaveEqualNumberOfOccurrences {

  public static boolean checkOccurrences(String s) {

    HashMap<Character, Integer> map = new HashMap<>();

    for (int i = 0; i < s.length(); i++) {
      if (!map.containsKey(s.charAt(i))) map.put(s.charAt(i), 1);
      else map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
    }
   
    ArrayList<Integer> list = new ArrayList<>(map.values());
    
    for (int i = 0; i < list.size() - 1; i++)
      if (!list.get(i).equals(list.get(i + 1))) 
        return false;

    return true;
  }


  public static void main(String[] args) {
    String s = "mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm";

    System.out.println(checkOccurrences(s));
  }
}
