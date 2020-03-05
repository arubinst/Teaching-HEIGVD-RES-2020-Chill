package ch.heigvd.res.chill.domain.wasadigi;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BarbeRousseTest {

    @Test
    void thePriceAndNameForBarbeRousseShouldBeCorrect() {
        BarbeRousse beer = new BarbeRousse();
        assertEquals(beer.getName(), BarbeRousse.NAME);
        assertEquals(beer.getPrice(), BarbeRousse.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForBarbeRousse() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.wasadigi.BarbeRousse";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = BarbeRousse.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}