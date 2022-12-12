package streams;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import lambdas.ExampleData;
import lambdas.Product;

public class AdvancedStreamsExample03 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    List<String> productNames1 = products.stream().reduce(new ArrayList<>(), (list, product) -> {
          ArrayList<String> newList = new ArrayList<>(list);
          newList.add(product.getName());
          return newList;
        },
        (list1, list2) -> {
          ArrayList<String> newList = new ArrayList<>(list1);
          list1.addAll(list2);
          return newList;
        });
    System.out.println(productNames1);

    List<String> productNames2 = products.stream()
        .collect(ArrayList::new, (list, product) -> list.add(product.getName()), ArrayList::addAll);
    System.out.println(productNames2);
  }
}
