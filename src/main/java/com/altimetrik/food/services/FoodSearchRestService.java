package com.altimetrik.food.services;

import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.altimetrik.food.models.Recipe;
import com.fasterxml.jackson.databind.JsonNode;

@Service
public class FoodSearchRestService {
	static String URL = "https://api.edamam.com/search?app_id=21125b03&app_key=f28f37b59bb5d3f40e35bc60b8c68aec";

	public JsonNode getRestRequestForReciepe(String mealName, String urlappend, HttpMethod requestType) {
		RestTemplate restTemplate = new RestTemplate();
		System.out.println(URL + urlappend);
		ResponseEntity<JsonNode> responseEntity = restTemplate.exchange(URL + urlappend, requestType, null, JsonNode.class);

		if (responseEntity.getStatusCode() == HttpStatus.OK) {
			return responseEntity.getBody();
		} else {
			return null;
		}
	}
}
