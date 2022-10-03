package logicalOperators;

public class Main {
  public static void main(String[] args) {
    int temperature = 17;
    boolean isWarm = temperature > 10 && temperature < 30;
    System.out.println(isWarm);

    boolean hasHighIncome = false;
    boolean hasGoodCredit = true;
    boolean criminalRecord = false;
    boolean isEligible = (hasHighIncome || hasGoodCredit) && !criminalRecord;
    System.out.println(isEligible);
  }
}
