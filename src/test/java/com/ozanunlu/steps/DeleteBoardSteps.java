package com.ozanunlu.steps;

import com.ozanunlu.pages.DeleteBoard;

public class DeleteBoardSteps {

	DeleteBoard deleteBoard;

	public DeleteBoardSteps() {
		deleteBoard = new DeleteBoard();
	}

	public DeleteBoardSteps deleteBoard() {
		deleteBoard.deleteBoard();
		return this;
	}
}
