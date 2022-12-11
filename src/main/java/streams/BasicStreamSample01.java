package streams;

import java.util.List;
import java.util.stream.Stream;
import lambdas.ExampleData;
import lambdas.Product;

public class BasicStreamSample01 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Stream<Product> stream = products.stream().map(product -> {
      System.out.println(product);
      return product;
    });

    stream.forEach(product -> {});
  }
}
