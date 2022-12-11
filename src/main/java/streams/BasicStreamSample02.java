package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lambdas.ExampleData;
import lambdas.Product;

public class BasicStreamSample02 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Stream<Product> stream = products.stream();

    String[] array = new String[]{"one", "two", "three"};
    Stream<String> stream2 = Arrays.stream(array);
    Stream<String> stream3 = Stream.of("one", "two", "three");
    Stream<String> stream4 = Stream.ofNullable("four");
    Stream<?> stream5 = Stream.empty();

    IntStream dice = new Random().ints(1, 7);

    try (BufferedReader in = new BufferedReader(
        new FileReader("README.md", StandardCharsets.UTF_8))) {
      in.lines().forEach(System.out::println);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
