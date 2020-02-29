package ch.heigvd.res.chill.domain.elvildor;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Magners implements IProduct {
    public final static String NAME = "Magners";
    public final static BigDecimal PRICE = new BigDecimal(1.3);

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public BigDecimal getPrice() { return PRICE; }
}
