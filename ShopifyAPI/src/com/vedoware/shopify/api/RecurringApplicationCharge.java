package com.vedoware.shopify.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "recurringApplicationCharge")
public class RecurringApplicationCharge implements ShopifyResource {

	@JsonProperty("activated_on")
	private Date activatedOn;

	@JsonProperty("billing_on")
	private Date billingOn;

	@JsonProperty("cancelled_on")
	private Date cancelledOn;

	@JsonProperty("confirmation_url")
	private String confirmationUrl;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("name")
	private String name;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("return_url")
	private String returnUrl;

	@JsonProperty("test")
	private Boolean test;

	@JsonProperty("trial_days")
	private Integer trialDays;

	@JsonProperty("trial_ends_on")
	private Date trialEndsOn;

	@JsonProperty("updated_at")
	private Date updatedAt;

	public Date getActivatedOn() {
		return activatedOn;
	}

	public void setActivatedOn(Date activatedOn) {
		this.activatedOn = activatedOn;
	}

	public Date getBillingOn() {
		return billingOn;
	}

	public void setBillingOn(Date billingOn) {
		this.billingOn = billingOn;
	}

	public Date getCancelledOn() {
		return cancelledOn;
	}

	public void setCancelledOn(Date cancelledOn) {
		this.cancelledOn = cancelledOn;
	}

	public String getConfirmationUrl() {
		return confirmationUrl;
	}

	public void setConfirmationUrl(String confirmationUrl) {
		this.confirmationUrl = confirmationUrl;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
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

	public String getReturnUrl() {
		return returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public Integer getTrialDays() {
		return trialDays;
	}

	public void setTrialDays(Integer trialDays) {
		this.trialDays = trialDays;
	}

	public Date getTrialEndsOn() {
		return trialEndsOn;
	}

	public void setTrialEndsOn(Date trialEndsOn) {
		this.trialEndsOn = trialEndsOn;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
		
}
