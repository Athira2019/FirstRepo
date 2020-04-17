package com.cerner.training.behaviour.state.test;

import com.cerner.training.behaviour.state.Kid;

public class StateClient {
	public static void main(String[] args) {
		Kid kid = new Kid(2);
		kid.eat();
		kid.play();
		kid.setAge(4);
		kid.eat();
		kid.play();
	}
}
