package commandlineapp.helloworld;

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

    System.out.println("Hello World");
    System.out.println(name + " is " + age);
    System.out.println(bill);
    System.out.println(price);
    System.out.println(amount);
    System.out.println(now);
    System.out.println(sentence.trim());

  }
}
