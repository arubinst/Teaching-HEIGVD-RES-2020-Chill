package ch.heigvd.res.chill.domain.haxos;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.domain.haxos.DrGabs;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DrGabsTest {

    @Test
    void thePriceAndNameForDrGabsShouldBeCorrect() {
        DrGabs beer = new DrGabs();
        assertEquals(beer.getName(), DrGabs.NAME);
        assertEquals(beer.getPrice(), DrGabs.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForDrGabs() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.haxos.DrGabs";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = DrGabs.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
