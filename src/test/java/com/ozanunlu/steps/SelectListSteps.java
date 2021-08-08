package com.ozanunlu.steps;

import com.ozanunlu.pages.SelectList;

public class SelectListSteps {

	SelectList selectList;

	public SelectListSteps() {
		selectList = new SelectList();
	}

	public SelectListSteps selectList() {
		selectList.selectList();
		return this;
	}
}
