package tasks01;

public class Palindrome {

  public static void main(String[] args) {
    int numb1 = 143341; // true
    int numb2 = 1435341; // true
    int numb3 = 143541; // false

    System.out.println(isPalindrome1(numb1));
    System.out.println(isPalindrome1(numb2));
    System.out.println(isPalindrome1(numb3));

    System.out.println();

    System.out.println(isPalindrome2(numb1));
    System.out.println(isPalindrome2(numb2));
    System.out.println(isPalindrome2(numb3));
  }

  private static boolean isPalindrome1(int numb) {
    String s = String.valueOf(numb);
    int count = s.length();
    int mid = count / 2;

    return s.substring(0, mid)
        .equals(
            new StringBuilder(s.substring(count % 2 == 0 ? mid : mid + 1, count)).reverse()
                .toString()
        );
  }

  private static boolean isPalindrome2(int numb) {
    String s = String.valueOf(numb);
    int count = s.length();
    int mid = count / 2;

    for (int i = 0; i < mid; i++) {
      if (s.charAt(i) != s.charAt(count - 1 - i)) {
        return false;
      }
    }

    return true;
  }
}
