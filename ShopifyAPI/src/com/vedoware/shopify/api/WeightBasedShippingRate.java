package com.vedoware.shopify.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "weight_based_shipping_rate")
public class WeightBasedShippingRate implements ShopifyResource {

	@JsonProperty("country_id")
	private Integer countryId;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("weight_high")
	private Double weightHigh;

	@JsonProperty("weight_low")
	private Double weightLow;
	
	@JsonProperty("offsets")
	private List<Offset> offsets;

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getWeightHigh() {
		return weightHigh;
	}

	public void setWeightHigh(Double weightHigh) {
		this.weightHigh = weightHigh;
	}

	public Double getWeightLow() {
		return weightLow;
	}

	public void setWeightLow(Double weightLow) {
		this.weightLow = weightLow;
	}

	public List<Offset> getOffsets() {
		return offsets;
	}

	public void setOffsets(List<Offset> offsets) {
		this.offsets = offsets;
	}
	
}
