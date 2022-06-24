package datatypes;

public class PrimitiveIntegrals {

  public static void main(String[] args) {
    System.out.println("** Print integrals **");
    //byte range
    byte maxByte = 127;
    byte minByte = -128;

    //short range
    short maxShort= 32767;
    short minShort = -32768;

    //int range
    int maxInt = 2_147_483_647;
    int minInt = -2_147_483_648;

    //long range
    long maxLong = Long.MAX_VALUE;
    long minValue = Long.MIN_VALUE;
  }
}
