package streams;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Stream;
import lambdas.ExampleData;
import lambdas.Product;

public class AdvancedStreamsExample02 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Optional<BigDecimal> opt = products.stream()
        .map(Product::getPrice)
        .reduce(BigDecimal::add);
    opt.ifPresentOrElse(
        total -> System.out.printf("The total value of all products is: $ %.3f%n", total),
        () -> System.out.println("There are no products"));
    // The total value of all products is: $ 139.400

    BigDecimal total = products.stream()
        .map(Product::getPrice)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    System.out.printf("The total value of all products is: $ %.3f%n", total);
    // The total value of all products is: $ 139.400

    BigDecimal total2 = products.stream()
        .reduce(BigDecimal.ZERO, (result, product) -> result.add(product.getPrice()),
            BigDecimal::add);
    System.out.printf("The total value of all products is: $ %.3f%n", total2);
    // The total value of all products is: $ 139.400

  }
}
