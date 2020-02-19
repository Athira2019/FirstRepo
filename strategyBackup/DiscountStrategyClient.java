package com.cerner.training.behavioural.strategy.client;

import java.math.BigDecimal;

import com.cerner.training.behavioural.strategy.Discount;

public class DiscountStrategyClient {
	Discount easterDiscount = new Discount() {
	    @Override
	    public BigDecimal applyDiscount(final BigDecimal amount) {
	        return amount.multiply(BigDecimal.valueOf(0.5));
	    }
	}; 
}
