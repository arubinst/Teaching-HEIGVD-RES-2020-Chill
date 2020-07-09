package ch.heigvd.res.chill.domain.fabano237;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class B33ExportTest {

    @Test
    void thePriceAndNameForB33ExportshouldBeCorrect() {
        B33Export beer = new B33Export();
        assertEquals(beer.getName(), B33Export.NAME);
        assertEquals(beer.getPrice(), B33Export.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForB33Export() {

        Bartender fabrice = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.fabano237.B33Export";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = fabrice.order(request);
        BigDecimal expectedTotalPrice = Castel.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }
}