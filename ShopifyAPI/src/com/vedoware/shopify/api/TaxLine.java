package com.vedoware.shopify.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "taxLine")
public class TaxLine implements ShopifyResource {

	@JsonProperty("price")
	private Double price;

	@JsonProperty("rate")
	private Double rate;

	@JsonProperty("title")
	private String title;

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
