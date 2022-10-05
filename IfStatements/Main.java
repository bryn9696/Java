package IfStatements;

public class Main {
  public static void main(String[] args) {
    int temp = 17;
    boolean hot = temp > 15;
    if (temp > 25) {
      System.out.println("It's damn hot");
      System.out.println("Get a drink");
    } else if (temp > 15) {
      System.out.println("great day");
    } else System.out.println("it do be cold");

    System.out.println(hot);
  }
}
