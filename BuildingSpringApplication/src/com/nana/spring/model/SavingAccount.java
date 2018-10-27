package com.nana.spring.model;

import com.nana.spring.Account;
import com.nana.spring.Card;

public class SavingAccount implements Account {

	private Card atmCard;
	
	/* Constructor injection */
	public SavingAccount(Card atmCard) {
		this.atmCard = atmCard;
	}

	@Override
	public String createAccount() {
		return "Saving Account Created Succesfully.";
	}

	@Override /* Constructor injection implementation */
	public String cardDetails() {
		// TODO Auto-generated method stub
		return atmCard.cardDetails();
	}
	
}
