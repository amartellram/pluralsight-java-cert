package streams;

import java.math.BigDecimal;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import lambdas.ExampleData;
import lambdas.Product;

public class AdvancedStreamsExample07 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    DoubleStream prices = products.stream()
        .mapToDouble(product -> product.getPrice().doubleValue());

    double total = prices.sum();
    System.out.printf("The sum of all products is $ %.2f%n", total);

    DoubleSummaryStatistics statistics = products.stream()
        .mapToDouble(product -> product.getPrice().doubleValue())
        .summaryStatistics();

    System.out.printf("Count    : %d%n", statistics.getCount());
    System.out.printf("Sum      : $ %.2f%n", statistics.getSum());
    System.out.printf("Minimum  : $ %.2f%n", statistics.getMin());
    System.out.printf("Maximum  : $ %.2f%n", statistics.getMax());
    System.out.printf("Average  : $ %.2f%n", statistics.getAverage());
  }
}
