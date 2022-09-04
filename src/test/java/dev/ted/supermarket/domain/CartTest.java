package dev.ted.supermarket.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CartTest {

  @Test
  void emptyCartHasTotalPriceOfZero() {
    Cart cart = new Cart();
    assertThat(cart.totalPrice()).isZero();
  }

  @Test
  public void addToothbrushProductThenTotalPriceIsOneDollar(){
    Cart cart = new Cart();
    cart.add("Toothbrush", 1);
    assertThat(cart.totalPrice()).isEqualTo(1);
  }

  @Test
  public void addTwoToothbrushProductThenTotalPriceIsTwoDollars(){
    Cart cart = new Cart();
    cart.add("Toothbrush", 1);
    cart.add("Toothbrush", 1);
    assertThat(cart.totalPrice()).isEqualTo(2);
  }

}
