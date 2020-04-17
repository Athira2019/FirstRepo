package com.cerner.training.structural.adapter.change;

import com.cerner.training.structural.adapter.Captain;
import com.cerner.training.structural.adapter.FishingBoatAdapter;

public class App {
	
	public static void main(String[] args) {
	    // The captain can only operate rowing boats but with adapter he is able to use fishing boats as well
	    Captain captain = new Captain(new FishingBoatAdapter());
	    captain.row();
	  }
	}

