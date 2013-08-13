package com.vedoware.shopify.api.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "paymentdetails")
public class PaymentDetails implements ShopifyResource {

	@JsonProperty("avs_result_code")
	private String avsResultCode;

	@JsonProperty("credit_card_bin")
	private String creditCardBin;

	@JsonProperty("cvv_result_code")
	private String cvvResultCode;
	
	@JsonProperty("credit_card_number")
	private String creditCardNumber;

	@JsonProperty("credit_card_company")
	private String creditCardCompany;

	public String getAvsResultCode() {
		return avsResultCode;
	}

	public void setAvsResultCode(String avsResultCode) {
		this.avsResultCode = avsResultCode;
	}

	public String getCreditCardBin() {
		return creditCardBin;
	}

	public void setCreditCardBin(String creditCardBin) {
		this.creditCardBin = creditCardBin;
	}

	public String getCvvResultCode() {
		return cvvResultCode;
	}

	public void setCvvResultCode(String cvvResultCode) {
		this.cvvResultCode = cvvResultCode;
	}

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getCreditCardCompany() {
		return creditCardCompany;
	}

	public void setCreditCardCompany(String creditCardCompany) {
		this.creditCardCompany = creditCardCompany;
	}
		
}
