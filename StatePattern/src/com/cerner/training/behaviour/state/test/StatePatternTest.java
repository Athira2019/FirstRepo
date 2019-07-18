package com.cerner.training.behaviour.state.test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.cerner.training.behaviour.state.DeliveredState;
import com.cerner.training.behaviour.state.OrderedState;
import com.cerner.training.behaviour.state.Package;
import com.cerner.training.behaviour.state.ReceivedState;

class StatePatternTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
    public void givenNewPackage_whenPackageReceived_thenStateReceived() {
        Package pkg = new Package();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(DeliveredState.class));
        pkg.nextState();

        assertThat(pkg.getState(), instanceOf(ReceivedState.class));
    }
	@Test
    public void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
        Package pkg = new Package();
        pkg.setState(new DeliveredState());
        pkg.previousState();

        assertThat(pkg.getState(), instanceOf(OrderedState.class));
    }
}
