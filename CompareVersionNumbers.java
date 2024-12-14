public class CompareVersionNumbers {

  /**
   * Compares two version numbers given as strings.
   *
   * The version numbers are expected to be in the format of "x.y.z" where x, y,
   * and z
   * are integer values representing major, minor, and patch versions,
   * respectively.
   * The function splits the version strings by the dot character and compares
   * each
   * corresponding segment as integers.
   *
   * @param v1 the first version number as a string
   * @param v2 the second version number as a string
   * @return 1 if v1 is greater than v2, -1 if v1 is less than v2, and 0 if both
   *         are equal
   */

  public static int compareVersions(String v1, String v2) {

    String[] versionOne = v1.split("\\.");
    String[] versionTwo = v2.split("\\.");

    int maxLength = Math.max(versionOne.length, versionTwo.length);

    for (int i = 0; i < maxLength; i++) {

      int s1 = i < versionOne.length ? Integer.parseInt(versionOne[i]) : 0;
      int s2 = i < versionTwo.length ? Integer.parseInt(versionTwo[i]) : 0;

      if (s1 > s2)
        return 1;
      else if (s1 < s2)
        return -1;
    }

    return 0;
  }

  public static void main(String[] args) {
    String version1 = "1.2";
    String version2 = "1.10";

    int result = compareVersions(version1, version2);
    if (result == 1)
      System.out.println("Version one : " + version1 + " is bigger than Version two : " + version2);

    else if (result == -1)
      System.out.println("Version one : " + version1 + " is smaller than Version two : " + version2);

    else
      System.out.println("Version one : " + version1 + " is same as Version two : " + version2);
  }
}
