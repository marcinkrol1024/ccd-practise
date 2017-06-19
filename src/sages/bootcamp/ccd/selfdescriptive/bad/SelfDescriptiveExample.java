package sages.bootcamp.ccd.selfdescriptive.bad;

public class SelfDescriptiveExample {
  public static void main(String[] args) {
    String input = "132321";
    
    // check if input contains only digits
    boolean check = input.replaceAll("[0-9]", "").replaceAll(" ", "").equals("");
    if (!check) {
      throw new IllegalArgumentException();
    }
  }
}
