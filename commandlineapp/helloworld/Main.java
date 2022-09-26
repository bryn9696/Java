package commandlineapp.helloworld;

import java.util.Arrays;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    int bill = 260_187_345;
    byte age = 26;
    double price = 6.54;
    float amount = 7.66F;
    String name = "Bryn";
    String sentence = "   Hi There \"Bryn\" \n \t\\filename";
    Date now = new Date();
    int[] numbers = new int[5];
    numbers[0] = 2;
    numbers[1] = 4;
    int[] numbers2 = { 2, 4, 6, 8, 10 };
    int[][] numbers3 = new int[2][3];
    numbers3[1][1] = 1;
    int[][] numbers4 = { {2, 4, 6}, {8, 10, 12}, {14, 16, 18} };
    final float PI = 3.14F;

    System.out.println("Hello World");
    System.out.println(name + " is " + age);
    System.out.println(bill);
    System.out.println(price);
    System.out.println(amount);
    System.out.println(now);
    System.out.println(sentence.trim());
    System.out.println(Arrays.toString(numbers));
    System.out.println(numbers2.length);
    System.out.println(Arrays.deepToString(numbers3));
    System.out.println(Arrays.deepToString(numbers4));
    System.out.println(PI);

  }
}
