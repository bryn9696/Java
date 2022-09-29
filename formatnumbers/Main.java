package formatnumbers;

import java.text.NumberFormat;

public class Main {
  public static void main(String[] args) {
    NumberFormat currency = NumberFormat.getCurrencyInstance();
    String result = currency.format(123456.829);
    System.out.println(result);
    String result1 = NumberFormat.getPercentInstance().format(0.4);
    System.out.println(result1);
  }
}
