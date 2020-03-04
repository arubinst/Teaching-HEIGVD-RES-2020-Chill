package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class boforLiteTest {

    @Test
    void thePriceAndNameForboforLiteshouldBeCorrect() {
        boforLite beer = new boforLite();
        assertEquals(beer.getName(), boforLite.NAME);
        assertEquals(beer.getPrice(), boforLite.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {

        Bartender fabrice = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.boforLite";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = fabrice.order(request);
        BigDecimal expectedTotalPrice = boforLite.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}