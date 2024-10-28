public class LicenseKeyFormatting {

  public static StringBuffer Ans = new StringBuffer();

  public static String extraRemover(String s) {

    StringBuffer buffer = new StringBuffer();

    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) != '-') 
        buffer.append(Character.toUpperCase(s.charAt(i)));
    }

    return buffer.toString();
  }

  public static void formatLicenseKey(String s, int k) {

    StringBuffer sb = new StringBuffer(s);

    if (sb.length() % k != 0) {
      int howManyDigitsToBeRemoved = sb.length() % k;
      Ans.append(sb.substring(0, howManyDigitsToBeRemoved));
      if (sb.length() != 1) 
        Ans.append("-");
      sb.delete(0, howManyDigitsToBeRemoved);
    }

    int times = sb.length() / k;

    for (int i = 1; i <= times; i++) {

      if (sb.length() == k) {
        Ans.append(sb.substring(0, k));
        break;
      }
      
      Ans.append(sb.substring(0, k));
      Ans.append("-");
      sb.delete(0, k);
    }
  }

  public static void main(String[] args) {
    
    String s = "5F3Z-2e-9-w-ui6-8ru74hu8fh48f";
    int k = 5;

    formatLicenseKey(extraRemover(s), k);

    System.out.println("Old key is : " + s + " [ Newly license formatted key : " + Ans + " ]");
  }
}
