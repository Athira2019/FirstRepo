package com.cerner.training.structural.adapter.change;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cerner.training.structural.adapter.movable.BugattiVeyron;
import com.cerner.training.structural.adapter.movable.Movable;
import com.cerner.training.structural.adapter.movable.MovableAdapter;
import com.cerner.training.structural.adapter.movable.MovableAdapterImpl;


class AdapterPatternTest {
	
	@BeforeEach
	void setUp() throws Exception {
	}


	@Test
	public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
	    Movable bugattiVeyron = new BugattiVeyron();
	    MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
	  
	    assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}
	@AfterEach
	void tearDown() throws Exception {
	}

	
}
