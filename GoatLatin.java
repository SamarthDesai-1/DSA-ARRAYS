public class GoatLatin {

  public static String solution(String str) {
    String[] array = str.split(" ");
    
    for (int i = 0; i < array.length; i++) {
      char isVowel = array[i].charAt(0);

      if (isVowel == 'a' || isVowel == 'e' || isVowel == 'i' || isVowel == 'o' || isVowel == 'u' || isVowel == 'A' || isVowel == 'E' || isVowel == 'I' || isVowel == 'O' || isVowel == 'U') {
        StringBuilder oneLetter = new StringBuilder("a");

        for (int j = 0; j < i; j++) oneLetter.append("a");

        StringBuilder sb = new StringBuilder(array[i] + "ma" + oneLetter);
        array[i] = sb.toString();
      }
      else {
        String temp = array[i];
        char removeFirstChar = temp.charAt(0);
        StringBuilder oneLetter = new StringBuilder("a");

        for (int j = 0; j < i; j++) oneLetter.append("a");
 
        StringBuilder sb = new StringBuilder(temp.substring(1) + removeFirstChar + "ma" + oneLetter);
        array[i] = sb.toString();
      }
    }
  
    StringBuilder ans = new StringBuilder("");
    for (String x : array) ans.append(x).append(" ");
    
    return ans.substring(0, ans.length() - 1);    
  }

  public static void main(String[] args) {
    String str = "The quick brown fox jumped over the lazy dog";
    System.out.println("Output : " + solution(str));
  }
  
}


