package com.cerner.training.behavioural.strategy.client;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cerner.training.behavioural.strategy.Discount;
import com.cerner.training.behavioural.strategy.EasterDiscount;

class StrategyPatternTest {
	Discount easterDiscounter;
	@BeforeEach
	void setUp() throws Exception {
		easterDiscounter = new EasterDiscount();
	}

	@Test
	public void testEasterDiscount()
	{
		BigDecimal discountedValue = easterDiscounter
				  .applyDiscount(BigDecimal.valueOf(100));
		BigDecimal expectedDiscounted=BigDecimal.valueOf(50);	
		assertTrue(discountedValue.compareTo(expectedDiscounted) == 0);
		
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	
}
