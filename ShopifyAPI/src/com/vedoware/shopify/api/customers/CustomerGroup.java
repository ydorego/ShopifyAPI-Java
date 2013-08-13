package com.vedoware.shopify.api.customers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.BaseObject;

@JsonRootName(value = "customergroup")
public class CustomerGroup extends BaseObject {

	@JsonProperty("name")
	private String name;

	@JsonProperty("query")
	private String query;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuery() {
		return query;
	}

	public void setQuery(String query) {
		this.query = query;
	}
		
}
