package com.ozanunlu.pages;

import com.ozanunlu.data.DataVal;
import com.ozanunlu.utils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class CreateCard {

	public void createCard() {
		RestAssured.baseURI = PropertyReader.get("trelloApiUrlCard");
		RequestSpecification httpRequest = RestAssured.given().queryParam("key", PropertyReader.get("key"))
				.queryParam("token", PropertyReader.get("token"))
				.queryParam("idList", DataVal.STATIC_DATA.get("listid"));
		httpRequest.header("Content-Type", "application/json");
		httpRequest.post();
	}
}
