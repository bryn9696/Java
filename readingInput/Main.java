package readingInput;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Name: ");
      String name = scanner.nextLine().trim();
      System.out.print("Age: ");
      byte age = scanner.nextByte();
      System.out.println("you are " + name + ", you are " + age);
    }
  }
}
