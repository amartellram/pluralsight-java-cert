package datatypes;

public class PrimitiveChars {

  public static void main(String[] args) {
    char aLetter = 'A';
    char aUnicode = '\u0041';
    char aNumber = 65;

    if(aLetter == aUnicode && aUnicode == aNumber){
      System.out.println("Equals");
    }

    char newLine = '\n';
    System.out.println(newLine);

    char minChar = 0;
    char maxChar = 65535;
  }

}
