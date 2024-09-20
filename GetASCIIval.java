public class GetASCIIval {

  public static void main(String[] args) {
    String str = "AZ";

    int ch = str.charAt(0) - 32;
    System.out.println((char) ch);


    System.out.println((int) str.charAt(0));
    System.out.println((int) str.charAt(1));

  }
}
