package com.vedoware.shopify.api;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "country")
public class Country implements ShopifyResource {

	@JsonProperty("code")
	private String code;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("provinces")
	private List<Province> provinces;

	@JsonProperty("tax")
	private Double tax;

	@JsonProperty("weight_based_shipping_rates")
	private List<WeightBasedShippingRate> weightBasedShippingRates;

	@JsonProperty("carrier_shipping_rate_providers")
	private List<CarrierShippingRateProvider> carrierShippingRateProviders;
	
	@JsonProperty("price_based_shipping_rates")
	private List<PriceBasedShippingRate> priceBasedShippingRates;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
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

	public List<Province> getProvinces() {
		return provinces;
	}

	public void setProvinces(List<Province> provinces) {
		this.provinces = provinces;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	public List<WeightBasedShippingRate> getWeightBasedShippingRates() {
		return weightBasedShippingRates;
	}

	public void setWeightBasedShippingRates(
			List<WeightBasedShippingRate> weightBasedShippingRates) {
		this.weightBasedShippingRates = weightBasedShippingRates;
	}

	public List<CarrierShippingRateProvider> getCarrierShippingRateProviders() {
		return carrierShippingRateProviders;
	}

	public void setCarrierShippingRateProviders(
			List<CarrierShippingRateProvider> carrierShippingRateProviders) {
		this.carrierShippingRateProviders = carrierShippingRateProviders;
	}

	public List<PriceBasedShippingRate> getPriceBasedShippingRates() {
		return priceBasedShippingRates;
	}

	public void setPriceBasedShippingRates(
			List<PriceBasedShippingRate> priceBasedShippingRates) {
		this.priceBasedShippingRates = priceBasedShippingRates;
	}
		
}
