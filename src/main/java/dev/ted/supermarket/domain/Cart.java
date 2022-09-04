package dev.ted.supermarket.domain;

public class Cart {

  private int totalPrice = 0;

  public int totalPrice() {
    return totalPrice;
  }

  public void add(String productName, int productPrice) {
    this.totalPrice += productPrice;
  }

  public String receipt() {
    return String.format("*"
        + " Total Price: $%s"
        + " *", totalPrice);
  }
}
