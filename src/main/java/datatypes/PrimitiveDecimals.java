package datatypes;

public class PrimitiveDecimals {

  public static void main(String[] args) {
    System.out.println("** Primitive decimals **");

    /* Floats and doubles hold decimal point numbers */
    float piFloat = 3.14f;
    double piDouble = 3.14;

    piFloat = 3.141592653f;
    piDouble = 3.14159265358979323;

    float longToFloat = 1111112222222223L;
    double longToDouble = 1111111111111113L;

    System.out.println("longToFloat: " + longToFloat);
    System.out.println("longToDouble: " + longToDouble);
  }
}