import java.math.BigDecimal;

public class Auxiliary {

  public static void main(String[] args) {
    separateDoubleIntoIntegerDecimalParts();
  }

  private static void separateDoubleIntoIntegerDecimalParts() {
    double doubleNumber = 24.04;
    int intPart = (int) doubleNumber;
    System.out.println("Double Number: " + doubleNumber);
    System.out.println("Integer Part: " + intPart);
    System.out.println("Decimal Part: " + (doubleNumber - intPart));

    System.out.println("-------------------------------------------");

    //Splitting the String
    String doubleAsString = String.valueOf(doubleNumber);
    int indexOfDecimal = doubleAsString.indexOf(".");
    System.out.println("Double Number: " + doubleNumber);
    System.out.println("Integer Part: " + doubleAsString.substring(0, indexOfDecimal));
    System.out.println("Decimal Part: " + doubleAsString.substring(indexOfDecimal));

    //Using BigDecimal
    BigDecimal bigDecimal = new BigDecimal(String.valueOf(doubleNumber));
    int intValue = bigDecimal.intValue();
    System.out.println("Double Number: " + bigDecimal.toPlainString());
    System.out.println("Integer Part: " + intValue);
    System.out.println("Decimal Part: " + bigDecimal.subtract(
        new BigDecimal(intValue)).toPlainString());
  }

}
