package com.cerner.training.behavioural.strategy.client;

import com.cerner.training.behavioural.strategy.CreditCardStrategy;
import com.cerner.training.behavioural.strategy.Item;
import com.cerner.training.behavioural.strategy.ShoppingCart;
import com.cerner.training.behavioural.strategy.WalletStrategy;

public class ShoppingCartTest {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.addItem(item1);
		cart.addItem(item2);
		
		//pay by paypal
		cart.pay(new WalletStrategy("myemail@example.com", "mypwd"));
		
		//pay by credit card
		cart.pay(new CreditCardStrategy("Athira", "1234567890123456", "786", "12/15"));
	}

}


