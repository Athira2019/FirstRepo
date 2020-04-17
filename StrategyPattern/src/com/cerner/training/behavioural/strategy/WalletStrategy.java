package com.cerner.training.behavioural.strategy;

public class WalletStrategy implements PaymentStrategy {

	private String emailId;
	private String password;
	
	public WalletStrategy(String email, String pwd){
		this.emailId=email;
		this.password=pwd;
	}
	
	@Override
	public void pay(int amount) {
		System.out.println(amount + " paid using Paytm.");
	}

}

