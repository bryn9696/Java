package readingInput;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    byte age = scanner.nextByte();
    System.out.println("you are " + age);
  }
}
