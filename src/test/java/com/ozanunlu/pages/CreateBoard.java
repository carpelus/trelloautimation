package com.ozanunlu.pages;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.ozanunlu.data.DataVal;
import com.ozanunlu.utils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CreateBoard {

	String baoardName = "testicin";

	public void createBoard() {
		RestAssured.baseURI = PropertyReader.get("trelloApiUrl");
		RequestSpecification httpRequest = RestAssured.given().queryParam("key", PropertyReader.get("key"))
				.queryParam("token", PropertyReader.get("token")).queryParam("name", baoardName);
		httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.post();
		Gson gson = new Gson();
		JsonObject jsonObject = gson.fromJson(response.getBody().asString(), JsonObject.class);
		DataVal.STATIC_DATA.put("boardid", jsonObject.get("id").getAsString());
	}

}
