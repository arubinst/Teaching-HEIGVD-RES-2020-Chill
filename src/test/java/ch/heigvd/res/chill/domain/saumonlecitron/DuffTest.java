package ch.heigvd.res.chill.domain.saumonlecitron;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.saumonlecitron.Duff;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DuffTest {

    @Test
    void thePriceAndNameForPunkIPAShouldBeCorrect() {
        Duff beer = new Duff();
        assertEquals(beer.getName(), Duff.NAME);
        assertEquals(beer.getPrice(), Duff.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPunkIPA() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.saumonlecitron.Duff";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Duff.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}