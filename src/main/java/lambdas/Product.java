package lambdas;

import java.math.BigDecimal;

public class Product {
 private String name;
 private BigDecimal price;

 private Category category;

  public Product() {
  }

  public Product(Category category, String name, BigDecimal price) {
    this.category = category;
    this.name = name;
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", category=" + category +
        '}';
  }
}
