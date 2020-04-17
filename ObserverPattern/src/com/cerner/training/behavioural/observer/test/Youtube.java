package com.cerner.training.behavioural.observer.test;

import com.cerner.training.behavioural.observer.Channels;
import com.cerner.training.behavioural.observer.Subject;
import com.cerner.training.behavioural.observer.Subscriber;

public class Youtube {

	public static void main(String[] args) {
	
		Subject youtubeChannel=new Channels();
		
		//creating new subscribers
		Subscriber techSubscriber=new Subscriber("tech");
		Subscriber CSubscriber=new Subscriber("C");
		Subscriber javaSubscriber=new Subscriber("java");
		Subscriber pythonSubscriber=new Subscriber("python");
		Subscriber jsSubscriber=new Subscriber("js");
		
		//making channel aware of new subscribers
		youtubeChannel.addSubcriber(techSubscriber);
		youtubeChannel.addSubcriber(CSubscriber);
		youtubeChannel.addSubcriber(javaSubscriber);
		youtubeChannel.addSubcriber(pythonSubscriber);
		youtubeChannel.addSubcriber(jsSubscriber);
		
		//Making subscribers aware of the the channel subscribed
		techSubscriber.subscribeChannel(youtubeChannel);
		CSubscriber.subscribeChannel(youtubeChannel);
		javaSubscriber.subscribeChannel(youtubeChannel);
		pythonSubscriber.subscribeChannel(youtubeChannel);
		jsSubscriber.subscribeChannel(youtubeChannel);
		
		youtubeChannel.upload("Lesson 1");
		
		System.out.println("Upload message for 5 users");
		youtubeChannel.removeSubcriber(jsSubscriber);
		System.out.println("Removed 1 user");
		youtubeChannel.upload("Lesson 2");
		System.out.println("Upload message for 4 users");
		

	}

}
