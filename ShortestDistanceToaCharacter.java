import java.util.Scanner;

public class ShortestDistanceToaCharacter {

  public static void shortestDistance(String s, char c) {

    int n = s.length();
    int[] distances = new int[n];

    for (int i = 0; i < s.length(); i++) {

      if (s.charAt(i) == c) {
        distances[i] = 0;
        continue;
      }
      
      /** Calculate distance for left side */
      int x = i - 1;
      int LeftIndex = -1;
      while (x >= 0) {
        if (s.charAt(x) == c) {
          LeftIndex = x;
          break;
        }
        
        x--;
      } 

      /** Calculate distance for right side */
      x = i + 1;
      int RightIndex = -1;
      while (x < n) {
        if (s.charAt(x) == c) {
          RightIndex = x;
          break;
        }

        x++;
      }
      
      if (RightIndex == -1 && LeftIndex == -1)
        distances[i] = -1;
      else if (LeftIndex == -1)
        distances[i] = Math.abs(i - RightIndex);
      else if (RightIndex == -1)
        distances[i] = Math.abs(i - LeftIndex);
      else 
        distances[i] = Math.min(Math.abs(i - LeftIndex), Math.abs(i - RightIndex));
    }

    for (int d : distances)
      System.out.print(d + " ");
  }

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {

      System.out.print("Enter string : ");
      String s = input.next();
      System.out.print("Enter C : ");
      char c = input.next().charAt(0);


      shortestDistance(s, c);
    }
  }
}
