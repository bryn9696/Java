package fizzbuzz;

import java.util.Scanner;
import java.text.NumberFormat;

public class Main {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Number: ");
      int number = scanner.nextInt();
      
      if ((number % 3 == 0) && number % 5 == 0) {
        System.out.println("FizzBuzz");
      } else if (number % 3 == 0) {
        System.out.println("Buzz");
      } else if (number % 5 == 0) {
        System.out.println("Fizz");
      } else System.out.println(number);

      }
  }
}
