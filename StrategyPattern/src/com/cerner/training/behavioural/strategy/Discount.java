package com.cerner.training.behavioural.strategy;

import java.math.BigDecimal;

public interface Discount {
	  BigDecimal applyDiscount(BigDecimal amount);
	
}
