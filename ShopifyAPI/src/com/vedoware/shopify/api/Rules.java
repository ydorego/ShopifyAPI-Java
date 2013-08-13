package com.vedoware.shopify.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "rules")
public class Rules implements ShopifyResource {

	@JsonProperty("column")
	private String column;

	@JsonProperty("relation")
	private String relation;

	@JsonProperty("condition")
	private String condition;

	public String getColumn() {
		return column;
	}

	public void setColumn(String column) {
		this.column = column;
	}

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
}
