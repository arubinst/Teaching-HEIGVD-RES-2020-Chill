package ch.heigvd.res.chill.domain.llievre;

import ch.heigvd.res.chill.domain.IProduct;

import java.math.BigDecimal;

public class Grimbergen implements IProduct {

  public final static String NAME = "Grimbergen";
  public final static BigDecimal PRICE = new BigDecimal(1.58);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
