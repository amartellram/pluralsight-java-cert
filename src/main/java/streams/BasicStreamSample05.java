package streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lambdas.Category;
import lambdas.ExampleData;
import lambdas.Product;

public class BasicStreamSample05 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();
    List<String> foodProductNames = products.stream()
        .filter(product -> product.getCategory() == Category.FOOD)
        .map(Product::getName)
        .collect(Collectors.toList());
    System.out.println(foodProductNames);

    String categories = products.stream()
        .map(Product::getCategory)
        .distinct()
        .map(Category::name)
        .collect(Collectors.joining(";"));
    System.out.println(categories);
  }
}
