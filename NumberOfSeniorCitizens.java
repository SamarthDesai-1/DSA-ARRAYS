public class NumberOfSeniorCitizens {

  public static final int start = 11;
  public static final int end = 13;

  public static int numberOfSeniorCitizens(String[] s) {
    int count = 0;

    for (int i = 0; i < s.length; i++)
      if (Integer.parseInt(s[i].substring(start, end)) > 60) count++;

    return count;
  }

  public static void main(String[] args) {
    String[] details = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };

    System.out.println("Senior citizens counts are : " + numberOfSeniorCitizens(details));
  }
}
