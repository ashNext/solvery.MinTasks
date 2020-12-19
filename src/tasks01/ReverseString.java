package tasks01;

public class ReverseString {

  public static void main(String[] args) {
    String normalString = "abcdefg"; // gfedcba
    System.out.println(stringReverse1(normalString));
    System.out.println(stringReverse2(normalString));
  }

  private static String stringReverse1(String s) {
    StringBuilder result = new StringBuilder();
    for (int i = s.length() - 1; i >= 0; i--) {
      result.append(s.charAt(i));
    }
    return result.toString();
  }

  private static String stringReverse2(String s) {
    StringBuilder stringBuilder = new StringBuilder(s);
    return stringBuilder.reverse().toString();
  }
}
