package datatypes;

import java.util.Random;

public class FieldsVsVariables {

  // instance variables
  int field_a = 1000;
  float field_c = 3.14f;

  public void method() {
    /*Local variables*/
    short variable_a;
    String variable_b;
  }


  // Make sure local variables have been initialized
  public static void main(String[] args) {
    /**/
    String variable_d = "another_string";

    // partial initialization won't compile
    Boolean flag = (new Random()).nextBoolean();
    long variable_x;

    if(flag){
      variable_x = 100L;
    } /*else {
      variable_x = 500L;
    }*/
    // System.out.println(variable_x); // if else is removed the code won't compile
  }

}
