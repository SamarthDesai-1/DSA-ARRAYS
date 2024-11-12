import java.util.*;

public class IntersectionOfTwoArrays2 {

  public static Vector<Integer> intersetPoints(int[] numsOne, int[] numsTwo) {
    
    Vector<Integer> vector = new Vector<>();
    HashMap<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < numsOne.length; i++) {
      map.put(numsOne[i], map.getOrDefault(numsOne[i], 0) + 1);
    }

    for (int x : numsTwo) {

      if (map.containsKey(x)) {

        int value = map.get(x);

        if (value > 1) map.put(x, value - 1);
        else if (value == 1) map.remove(x);

        vector.add(x);
      }
    }

    return vector;
  }

  public static void main(String[] args) {
    int[] numsOne = { 4, 9, 5 };
    int[] numsTwo = { 9, 4, 9, 8, 4 };

    System.out.println("Intersection points between two arrays are : " + intersetPoints(numsOne, numsTwo));
  }
}
