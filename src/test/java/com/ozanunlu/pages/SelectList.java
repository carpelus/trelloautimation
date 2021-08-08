package com.ozanunlu.pages;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.ozanunlu.data.DataVal;
import com.ozanunlu.utils.PropertyReader;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SelectList {

	public void selectList() {
		RestAssured.baseURI = PropertyReader.get("trelloApiUrl").concat(DataVal.STATIC_DATA.get("boardid"))
				.concat("/lists/");

		RequestSpecification httpRequest = RestAssured.given().queryParam("key", PropertyReader.get("key"))
				.queryParam("token", PropertyReader.get("token"));
		httpRequest.header("Content-Type", "application/json");
		Response response = httpRequest.get();
		Gson gson = new Gson();
		JsonArray arr = gson.fromJson(response.getBody().asString(), JsonArray.class);
		DataVal.STATIC_DATA.put("listid", arr.get(0).getAsJsonObject().get("id").getAsString());
	}
}
