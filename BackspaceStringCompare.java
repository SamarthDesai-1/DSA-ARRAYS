import java.util.Stack;

public class BackspaceStringCompare {

  public static Stack<Character> processor(int priority, Stack<Character> st1, Stack<Character> st2, String s, String t) {
    int len = priority == 0 ? s.length() : t.length();
    
    for (int i = 0; i < len; i++) {

      if (priority == 0) {
        if (s.charAt(i) != '#') st1.push(s.charAt(i));
        else {
            if (st1.isEmpty()) continue;
            st1.pop();
        }
      }

      if (priority == 1) {   
        if (t.charAt(i) != '#') st2.push(t.charAt(i));
        else {
            if (st2.isEmpty()) continue;
            st2.pop();
        }
      }
    }

    return priority == 0 ? st1 : st2;
  }

  public static String answer(int priority, Stack<Character> ansStackOne, Stack<Character> ansStackTwo) {
    
    StringBuilder sb = new StringBuilder("");
    
    if (priority == 0) 
      while (!ansStackOne.empty()) sb.append(ansStackOne.pop());
    else
      while (!ansStackTwo.empty()) sb.append(ansStackTwo.pop());

    return sb.toString();
  }

  public static void main(String[] args) {
    String s = "a#c";
    String t = "d";
    Stack<Character> st1 = new Stack<>();
    Stack<Character> st2 = new Stack<>();
    Stack<Character> ansStackOne = processor(0, st1, st2, s, t);
    Stack<Character> ansStackTwo = processor(1, st1, st2, s, t);

    if (answer(0, ansStackOne, ansStackTwo).equals(answer(1, ansStackOne, ansStackTwo))) System.out.println(true);
    else System.out.println(false);
  }
}
