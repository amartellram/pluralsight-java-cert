package streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.regex.Pattern;
import java.util.stream.Stream;
import lambdas.Category;
import lambdas.ExampleData;
import lambdas.Product;

public class BasicStreamSample04 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Optional<Product> opt = products.stream()
        .filter(product -> product.getCategory() == Category.OFFICE)
        .findAny();

    opt.ifPresent(System.out::println);

    boolean foundOfficeProduct = products.stream()
        .anyMatch(product -> product.getCategory() == Category.OFFICE);
    System.out.println("Does the list contain at least one office product? " + foundOfficeProduct);

    BigDecimal priceLimit = new BigDecimal("10.00");
    boolean allProductsAreCheap = products.stream()
        .allMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
    System.out.println("Are all products cheap? " + allProductsAreCheap);

    boolean allProductsAreExpensive = products.stream()
        .noneMatch(product -> product.getPrice().compareTo(priceLimit) < 0);
    System.out.println("Are all products expensive? " + allProductsAreExpensive);
  }
}
