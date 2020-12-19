package tasks01;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

  public static void main(String[] args) {
    int numb = 196; //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
    System.out.println(findFibs(numb));

    int fibNumb = 21;
    System.out.println(isFib(fibNumb)); // true

    int notFibNumb = 15;
    System.out.println(isFib(notFibNumb)); // false
  }

  private static List<Integer> findFibs(int numb) {
    List<Integer> fibsList = new ArrayList<>();

    if (numb < 0) {
      return fibsList;
    }

    fibsList.add(0);

    if (numb == 0) {
      return fibsList;
    }

    fibsList.add(1);
    int indCurrent = 1;
    while (fibsList.get(indCurrent - 1) + fibsList.get(indCurrent) <= numb) {
      fibsList.add(fibsList.get(indCurrent - 1) + fibsList.get(indCurrent++));
    }

    return fibsList;
  }

  private static boolean isFib(int numb) {
    return findFibs(numb).contains(numb);
  }

}
