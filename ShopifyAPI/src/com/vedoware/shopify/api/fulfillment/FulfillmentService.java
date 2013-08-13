package com.vedoware.shopify.api.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "fulfillmentservice")
public class FulfillmentService implements ShopifyResource {

	@JsonProperty("callback_url")
	private String callbackUrl;

	@JsonProperty("format")
	private String format;

	@JsonProperty("handle")
	private String handle;

	@JsonProperty("inventory_management")
	private Boolean inventoryManagement;

	@JsonProperty("name")
	private String name;

	@JsonProperty("requires_shipping_method")
	private Boolean requiresShippingMethod;
	
	@JsonProperty("tracking_support")
	private Boolean trackingSupport;

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public Boolean getInventoryManagement() {
		return inventoryManagement;
	}

	public void setInventoryManagement(Boolean inventoryManagement) {
		this.inventoryManagement = inventoryManagement;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getRequiresShippingMethod() {
		return requiresShippingMethod;
	}

	public void setRequiresShippingMethod(Boolean requiresShippingMethod) {
		this.requiresShippingMethod = requiresShippingMethod;
	}

	public Boolean getTrackingSupport() {
		return trackingSupport;
	}

	public void setTrackingSupport(Boolean trackingSupport) {
		this.trackingSupport = trackingSupport;
	}
		
}
