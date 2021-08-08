package com.ozanunlu.steps;

import com.ozanunlu.pages.CreateCard;

public class CreateCardSteps {

	CreateCard createCard;

	public CreateCardSteps() {
		createCard = new CreateCard();
	}

	public CreateCardSteps createCard() {
		createCard.createCard();
		return this;
	}

}
