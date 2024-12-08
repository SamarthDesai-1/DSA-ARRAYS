import java.util.*;

public class IntersectionOfTwoArrays {

  public static Vector<Integer> intersectPoints(int[] numsOne, int[] numsTwo) {

    HashMap<Integer, Integer> map = new HashMap<>();
    Vector<Integer> vector = new Vector<>();

    for (int i = 0; i < numsOne.length; i++) 
      map.put(numsOne[i], map.getOrDefault(numsOne[i], 0) + 1);
    

    for (int key : numsTwo) {
      if (map.containsKey(key)) {
        vector.add(key);
        map.remove(key);
      }
    }

    return vector;
  }

  public static void main(String[] args) {
    int[] numsOne = { 1 };
    int[] numsTwo = { 1 };

    System.out.println("Intersection of two arrays is : " + intersectPoints(numsOne, numsTwo));
  }
}
