public class LengthOfLastWordTwo {

  public static int approachOne(String str) {
    str = str.trim();
    String[] strArr = str.split(" ");
  
    return strArr[strArr.length - 1].length();
  }

  public static int approachTwo(String str) {
    str = str.trim();
    int count = 0;
    
    if (!str.contains(" ")) 
      return str.length();
    else 
      for (int i = str.length() - 1; str.charAt(i) != ' '; i--)
        count++;
    

    return count;
  }
  
  public static void main(String[] args) {
    String str = "The apple is good for health agriculture";

    System.out.println("The length of last two words : " + approachOne(str) + " and " + approachTwo(str));
  } 
}

