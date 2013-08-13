package com.vedoware.shopify.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.fulfillment.Receipt;

@JsonRootName(value = "transactions")
public class Transactions implements ShopifyResource {

	@JsonProperty("amount")
	private Double amount;

	@JsonProperty("authorization")
	private String authorization;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("device_id")
	private Integer deviceId;

	@JsonProperty("gateway")
	private String gateway;

	@JsonProperty("gateway")
	private Integer id;

	@JsonProperty("kind")
	private String kind;

	@JsonProperty("order_id")
	private String orderId;

	@JsonProperty("receipt")
	private Receipt receipt;

	@JsonProperty("status")
	private String status;

	@JsonProperty("test")
	private Boolean test;

	@JsonProperty("user_id")
	private String userId;

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Integer deviceId) {
		this.deviceId = deviceId;
	}

	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public Receipt getReceipt() {
		return receipt;
	}

	public void setReceipt(Receipt receipt) {
		this.receipt = receipt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getTest() {
		return test;
	}

	public void setTest(Boolean test) {
		this.test = test;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
		
}
