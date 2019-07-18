package com.cerner.training.behavioural.observer.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.cerner.training.behavioural.observer.NewsAgency;
import com.cerner.training.behavioural.observer.NewsChannel;
import com.cerner.training.behavioural.observer.ONewsAgency;
import com.cerner.training.behavioural.observer.ONewsChannel;
import com.cerner.training.behavioural.observer.PCLNewsAgency;
import com.cerner.training.behavioural.observer.PCLNewsChannel;

public class ObserverIntegrationTest {

	@Before
	public void setUp() throws Exception {
	}
	@Test
    public void whenChangingNewsAgencyState_thenNewsChannelNotified() {

        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingONewsAgencyState_thenONewsChannelNotified() {

        ONewsAgency observable = new ONewsAgency();
        ONewsChannel observer = new ONewsChannel();

        observable.addObserver(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

    @Test
    public void whenChangingPCLNewsAgencyState_thenONewsChannelNotified() {

        PCLNewsAgency observable = new PCLNewsAgency();
        PCLNewsChannel observer = new PCLNewsChannel();

        observable.addPropertyChangeListener(observer);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }

	@After
	public void tearDown() throws Exception {
	}

	

}
