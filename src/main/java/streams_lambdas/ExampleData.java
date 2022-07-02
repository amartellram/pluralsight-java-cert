package streams_lambdas;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class ExampleData {

  public static List<Product> getProducts() {
    return Arrays.asList(new Product("spaghetti", new BigDecimal(2.5)),
                        new Product("nicolini", new BigDecimal(2.6)));
  }
}
