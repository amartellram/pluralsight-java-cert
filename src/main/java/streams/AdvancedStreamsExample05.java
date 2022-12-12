package streams;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lambdas.Category;
import lambdas.ExampleData;
import lambdas.Product;

public class AdvancedStreamsExample05 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Map<Category, List<Product>> productsByCategory = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory));

    System.out.println(productsByCategory);

    Map<Category, List<String>> productNamesByCategory = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory,
            Collectors.mapping(Product::getName, Collectors.toList())));
    System.out.println(productNamesByCategory);

    Map<Category, BigDecimal> totalPerCategory = products.stream()
        .collect(Collectors.groupingBy(Product::getCategory, Collectors.mapping(Product::getPrice,
            Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));
    System.out.println("totalPerCategory: " + totalPerCategory);
    // totalPerCategory: {FOOD=45.50, CLEANING=12.16, UTENSILS=56.49, OFFICE=25.25}
  }
}
