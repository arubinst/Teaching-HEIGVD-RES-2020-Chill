package ch.heigvd.res.chill.domain.elvildor;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.elvildor.Magners;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MagnersTest {

    @Test
    void thePriceAndNameForMagnersShouldBeCorrect() {
        Magners beer = new Magners();
        assertEquals(beer.getName(), Magners.NAME);
        assertEquals(beer.getPrice(), Magners.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForMagners() {
        Bartender jane = new Bartender();
        int quantity = 2;
        String productName = "ch.heigvd.res.chill.domain.elvildor.Magners";
        OrderRequest request = new OrderRequest(quantity, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Magners.PRICE.multiply(new BigDecimal(quantity));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}
