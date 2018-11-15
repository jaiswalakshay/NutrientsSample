package com.altimetrik.food.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@JsonInclude(Include.NON_NULL)
public class Recipe {
	
	private String q;
	private List<Object> hits;
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public List<Object> getHits() {
		return hits;
	}
	public void setHits(List<Object> hits) {
		this.hits = hits;
	}
	
}
