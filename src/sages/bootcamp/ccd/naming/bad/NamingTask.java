package sages.bootcamp.ccd.naming.bad;

public class NamingTask {
  public static void main(String[] args) {
    int[] wList = new int[]{1, 2, 3, 4, 5};
    int[] hList = new int[]{6, 7, 8, 9, 10};

    int s = 0;
    for (int i = 0; i < 5; i++) {
      s += rectAr(wList[i], hList[i]);
    }

    String messageString = String.format("Sum of rectangle areas is: %d", s);
    mFunction(messageString);
  }

  // this function calculates rectangle area
  private static int rectAr(int w, int h) {
    return w * h;
  }

  // this function shows message
  private static void mFunction(String m) {
    System.out.println(m);
  }
}
