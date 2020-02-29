package ch.heigvd.res.chill.domain.UxorialRook;

import ch.heigvd.res.chill.domain.Bartender;
import ch.heigvd.res.chill.protocol.OrderRequest;
import ch.heigvd.res.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaulanerTest {
    @Test
    void theNameOfThePaulanerShouldBeCorrect() {
        Paulaner beer = new Paulaner();
        assertEquals(beer.getName(), Paulaner.NAME);
    }

    @Test
    void thePriceOfThePaulanerShouldBeCorrect() {
        Paulaner beer = new Paulaner();
        assertEquals(beer.getPrice(), Paulaner.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForThePaulaner() {
        Bartender martin = new Bartender();
        String productName = "ch.heigvd.res.chill.domain.UxorialRook.Paulaner";
        OrderRequest request = new OrderRequest(4, productName);
        OrderResponse response = martin.order(request);
        BigDecimal expectedTotalPrice = Paulaner.PRICE.multiply(new BigDecimal(4));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
