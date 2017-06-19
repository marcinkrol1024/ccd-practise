package sages.bootcamp.ccd.naming.bad;

import java.util.Arrays;

public class NamingExample {
  public static void main(String[] args) {
    String[] tab1 = {"Beata", "Jan", "Monika", "Anna", "Tomasz"};
    String[] tab2 = new String[5];

    System.arraycopy(tab1, 0, tab2, 0, tab1.length);
    Arrays.sort(tab2);

    for (int i = 0; i < tab2.length; i++) {
      System.out.println(tab2[i]);
    }
  }
}
