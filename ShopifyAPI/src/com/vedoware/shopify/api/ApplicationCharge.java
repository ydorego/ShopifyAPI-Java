package com.vedoware.shopify.api;

import java.net.URL;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "applicationCharge")
public class ApplicationCharge extends BaseObject {

	@JsonProperty("confirmation_url")
	private String confirmationUrl;
	
	@JsonProperty("name")
	private String name;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("return_url")
	private String returnUrl;

	@JsonProperty("test")
	private String test;

	public URL getConfirmationUrlAsUrl() {
		return null;
	}
	
	public String getConfirmationUrl() {
		return confirmationUrl;
	}

	public void setConfirmationUrl(String confirmationUrl) {
		this.confirmationUrl = confirmationUrl;
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

	public URL getReturnUrlAsUrl() {
		return null;
	}	
	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}
	
}
