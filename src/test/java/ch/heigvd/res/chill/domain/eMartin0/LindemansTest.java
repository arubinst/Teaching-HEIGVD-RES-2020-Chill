package ch.heigvd.res.chill.domain.eMartin0;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LindemansTest {

  @Test
  void thePriceAndNameForLindemansShouldBeCorrect() {
    Lindemans beer = new Lindemans();
    assertEquals(beer.getName(), Lindemans.NAME);
    assertEquals(beer.getPrice(), Lindemans.PRICE);
  }

  @Test
  void aBartenderShouldAcceptAnOrderForLindemans() {
    Bartender jane = new Bartender();
    String productName = "ch.heigvd.res.chill.domain.eMartin0.Lindemans";
    OrderRequest request = new OrderRequest(2, productName);
    OrderResponse response = jane.order(request);
    BigDecimal expectedTotalPrice = Lindemans.PRICE.multiply(new BigDecimal(2));
    assertEquals(expectedTotalPrice, response.getTotalPrice());
  }

}