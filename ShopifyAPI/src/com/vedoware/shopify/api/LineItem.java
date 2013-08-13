package com.vedoware.shopify.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "lineItem")
public class LineItem implements ShopifyResource {

	@JsonProperty("fulfillment_service")
	private String fulfillmentService;

	@JsonProperty("fulfillment_status")
	private String fulfillmentStatus;

	@JsonProperty("grams")
	private String grams;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("price")
	private String price;

	@JsonProperty("product_id")
	private Integer productId;

	@JsonProperty("quantity")
	private String quantity;

	@JsonProperty("requires_shipping")
	private String requiresShipping;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("title")
	private String title;

	@JsonProperty("variant_id")
	private Integer variantId;

	@JsonProperty("variant_title")
	private String variantTitle;

	@JsonProperty("vendor")
	private String vendor;

	@JsonProperty("name")
	private String name;

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
	}

	public String getGrams() {
		return grams;
	}

	public void setGrams(String grams) {
		this.grams = grams;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(String requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getVariantId() {
		return variantId;
	}

	public void setVariantId(Integer variantId) {
		this.variantId = variantId;
	}

	public String getVariantTitle() {
		return variantTitle;
	}

	public void setVariantTitle(String variantTitle) {
		this.variantTitle = variantTitle;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
