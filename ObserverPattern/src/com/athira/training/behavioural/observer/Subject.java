package com.cerner.training.behavioural.observer;

public interface Subject {

	void addSubcriber(Subscriber subsriber);

	void removeSubcriber(Observer subsriber);

	void upload(String title);

	void notifySubscriber(String title);

}