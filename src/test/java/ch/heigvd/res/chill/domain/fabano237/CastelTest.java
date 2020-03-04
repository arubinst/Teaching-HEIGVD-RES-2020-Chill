package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CastelTest {
    @Test
    void thePriceAndNameForGuinesshouldBeCorrect() {
        Castel beer = new Castel();
        assertEquals(beer.getName(), Castel.NAME);
        assertEquals(beer.getPrice(), Castel.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForCastel() {

        Bartender fabrice = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.Castel";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = fabrice.order(request);
        BigDecimal expectedTotalPrice = Castel.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}