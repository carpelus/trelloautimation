package com.ozanunlu.steps;

import com.ozanunlu.pages.CreateBoard;

public class CreateBoardSteps {

	CreateBoard createBoard;

	public CreateBoardSteps() {
		createBoard = new CreateBoard();
	}

	public CreateBoardSteps create() {
		createBoard.createBoard();
		return this;
	}
}
