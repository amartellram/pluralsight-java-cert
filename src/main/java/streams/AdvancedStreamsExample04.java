package streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import lambdas.Category;
import lambdas.ExampleData;
import lambdas.Product;

public class AdvancedStreamsExample04 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Map<Category, BigDecimal> map = products.stream()
        .collect(Collectors.toMap(Product::getCategory, Product::getPrice, BigDecimal::add));
    System.out.println(map);
    // {UTENSILS=56.49, FOOD=45.50, OFFICE=25.25, CLEANING=12.16}
  }
}
