package com.cerner.training.behavioural.observer;

public interface Observer {

	void update();

	void subscribeChannel(Subject ch);

}