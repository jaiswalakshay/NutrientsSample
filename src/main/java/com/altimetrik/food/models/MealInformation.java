package com.altimetrik.food.models;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class MealInformation {
	private HashMap<String, Object> recipe;

	public HashMap<String, Object> getRecipe() {
		return recipe;
	}

	public void setRecipe(HashMap<String, Object> recipe) {
		this.recipe = recipe;
	}
}
