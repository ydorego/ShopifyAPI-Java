package com.vedoware.shopify.api.fulfillment;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.LineItem;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "fulfillmnt")
public class Fulfillment implements ShopifyResource {

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("line_items")
	private List<LineItem> lineItems;

	@JsonProperty("order_id")
	private Integer orderId;

	@JsonProperty("receipt")
	private Receipt receipt;

	@JsonProperty("status")
	private String status;

	@JsonProperty("tracking_company")
	private String trackingCompany;

	@JsonProperty("tracking_number")
	private Integer trackingNumber;
	
	@JsonProperty("tracking_urls")
	private List<String> trackingUrls;
	
	@JsonProperty("updated_at")
	private Date updatedAt;
	
	@JsonProperty("variant_inventory_management")
	private String variantInventoryManagement;

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

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
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

	public String getTrackingCompany() {
		return trackingCompany;
	}

	public void setTrackingCompany(String trackingCompany) {
		this.trackingCompany = trackingCompany;
	}

	public Integer getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(Integer trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public List<String> getTrackingUrls() {
		return trackingUrls;
	}

	public void setTrackingUrls(List<String> trackingUrls) {
		this.trackingUrls = trackingUrls;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public String getVariantInventoryManagement() {
		return variantInventoryManagement;
	}

	public void setVariantInventoryManagement(String variantInventoryManagement) {
		this.variantInventoryManagement = variantInventoryManagement;
	}
		
}
