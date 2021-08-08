package com.ozanunlu.requests;

import org.apache.logging.log4j.LogManager;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.ozanunlu.steps.CreateBoardSteps;
import com.ozanunlu.steps.CreateCardSteps;
import com.ozanunlu.steps.DeleteBoardSteps;
import com.ozanunlu.steps.SelectListSteps;
import com.ozanunlu.utils.TestMethodLogging;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BoardTest {

	@Rule
	public TestMethodLogging logRule = new TestMethodLogging(LogManager.getLogger(getClass()));

	CreateBoardSteps createBoardSteps = new CreateBoardSteps();
	SelectListSteps selectListSteps = new SelectListSteps();
	CreateCardSteps createCardSteps = new CreateCardSteps();
	DeleteBoardSteps deleteBoardSteps = new DeleteBoardSteps();

	@Test
	public void step1createBoard() {
		createBoardSteps.create();
	}

	@Test
	public void step2createCard() {
		selectListSteps.selectList();
		createCardSteps.createCard();
		createCardSteps.createCard();
	}

	@Test
	public void step3deleteBoard() {
		deleteBoardSteps.deleteBoard();
	}

}
