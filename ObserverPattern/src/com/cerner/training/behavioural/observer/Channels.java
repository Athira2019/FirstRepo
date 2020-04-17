package com.cerner.training.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class Channels implements Subject {
	private List<Subscriber> subscribers = new ArrayList<Subscriber>();
	private String title;

	@Override
	public void addSubcriber(Subscriber subsriber) {
		subscribers.add(subsriber);

	}

	@Override
	public void removeSubcriber(Observer subsriber) {
		subscribers.remove(subsriber);

	}

	@Override
	public void upload(String title)
	{
		this.title=title;
		notifySubscriber(title);
	}
	@Override
	public void notifySubscriber(String title) {
		for (Observer sub : subscribers) {
			sub.update();
		}
	}

}
