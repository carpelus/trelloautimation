package com.ozanunlu.pages;

import com.ozanunlu.data.DataVal;
import com.ozanunlu.utils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class DeleteBoard {

	public void deleteBoard() {
		RestAssured.baseURI = PropertyReader.get("trelloApiUrl").concat(DataVal.STATIC_DATA.get("boardid")).concat("/");

		RequestSpecification httpRequest = RestAssured.given().queryParam("key", PropertyReader.get("key"))
				.queryParam("token", PropertyReader.get("token"));
		httpRequest.header("Content-Type", "application/json");
		httpRequest.delete();
	}
}
