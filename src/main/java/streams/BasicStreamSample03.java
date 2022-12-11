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

public class BasicStreamSample03 {

  public static void main(String[] args) {
    List<Product> products = ExampleData.getProducts();

    Stream<Product> stream = products.stream();


  }
}
