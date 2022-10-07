package forLoops;

public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello World " + i);
    }

    int i = 3;
    while (i >= 0) {
      System.out.println("Hello World " + i);
      i--;
    }

    String[] fruits = { "apple", "orange", "pear"};

    for (String fruit : fruits) {
      System.out.println(fruit);
    }
  }
}
