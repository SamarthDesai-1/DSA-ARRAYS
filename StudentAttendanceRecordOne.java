public class StudentAttendanceRecordOne {

  public static boolean solution(String str) {
    int absent = 0;
    int late = 0;

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'A') {
        absent++;
      }
      else if (late != 3 && str.charAt(i) == 'L') {
        if (i > 0 && str.charAt(i - 1) == 'L' && i < str.length() - 1 && str.charAt(i + 1) == 'L') {
          late += 3;
        }
      }
    }

    return absent < 2 && late != 3 ? true : false;
  }

  public static void main(String[] args) {
    String str = "APPLL";
    System.out.println(solution(str));

  }
  
}
