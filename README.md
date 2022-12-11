# Notes about different courses for Java Certifications

[Working with Streams and Lambda Expressions in Java (Java SE 11 Developer Certification 1Z0-819)](https://app.pluralsight.com/library/courses/streams-lambda-expressions-java-se-11-developer-certification-1z0-819/table-of-contents)

## 04. Working with Streams - The basics

Process a sequence of elements by different kind of operations.

### Understanding streams

#### Stream pipeline

```
products.stream()
  .filter(product -> product.getCategory() == Category.FOOD)
  .map(Product::getName())
  .forEach(System.out::println);

```

interface java.util.stream

#### Intermediate and terminal operations

Streams doesn't produce elements unless there is a terminal operation.

```
Intermediate operations
  .filter(product -> product.getCategory() == Category.FOOD)
  .map(Product::getName())

Terminal operation
  .forEach(System.out::println);
```

### Differences between streams and collections

![image.png](assets/image.png)

#### Internal vs external iteration

**External iteration:** the iteration is not controlled by the collection itself

```
for (int i=0; i< products.size(); i++) {
  Product p = products.get(i);
  System.out.println(p);
}
```

**Internal iteration:** the iteration is controlled by the stream itself

```
products.stream()
  forEach(System.out::println);
```

### Obtaining streams

Factory methods: Stream.of(), Stream.ofNullable()

https://github.com/amartellram/pluralsight-java-cert/blob/274f1fba63a3a727f1a3069ca9667871cbf3f662/src/main/java/streams/BasicStreamSample03.java#L17-L36

### Filtering and transforming streams

* **filter:** intermediate operation, takes a predicate to filter
* **map:** one-to-one transformation. It takes a function and transform each element in the stream
* **flatMap:** one-to-many transformation.

### Searching in streams

### Reducing and collecting streams

## 05. Working with streams - In depth
