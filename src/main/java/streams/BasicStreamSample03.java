package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambdas.Category;
import lambdas.ExampleData;
import lambdas.Product;

public class BasicStreamSample03 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    products.stream()
        .filter(product ->  product.getCategory() == Category.FOOD)
        .forEach(System.out::println);

    products.stream()
        .map(product -> String.format("The price of %s is $ %.2f", product.getName(), product.getPrice()))
        .forEach(System.out::println);

    Pattern spaces = Pattern.compile("\\s+");
    products.stream()
        .flatMap(product -> spaces.splitAsStream(product.getName()))
        .forEach(System.out::println);

    Stream<String> stream = products.stream()
        .flatMap(product -> spaces.splitAsStream(product.getName()));



  }
}
