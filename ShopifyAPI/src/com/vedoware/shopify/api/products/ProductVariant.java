package com.vedoware.shopify.api.products;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "productvariant")
public class ProductVariant implements ShopifyResource {

	@JsonProperty("barcode")
	private String barcode;

	@JsonProperty("compare_at_price")
	private String compareAtPrice;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("fulfillment_service")
	private String fulfillmentService;

	@JsonProperty("grams")
	private Integer grams;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("inventory_management")
	private String inventoryManagement;

	@JsonProperty("inventory_policy")
	private String inventoryPolicy;

	@JsonProperty("inventory_quantity")
	private Integer inventoryQuantity;

	@JsonProperty("option1")
	private String option1;

	@JsonProperty("option2")
	private String option2;

	@JsonProperty("option3")
	private String option3;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("price")
	private Double price;

	@JsonProperty("product_id")
	private Integer productId;

	@JsonProperty("requires_shipping")
	private Boolean requiresShipping;

	@JsonProperty("sku")
	private String sku;

	@JsonProperty("taxable")
	private Boolean taxable;

	@JsonProperty("title")
	private String title;

	@JsonProperty("updated_at")
	private Date updatedAt;

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public String getCompareAtPrice() {
		return compareAtPrice;
	}

	public void setCompareAtPrice(String compareAtPrice) {
		this.compareAtPrice = compareAtPrice;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public void setFulfillmentService(String fulfillmentService) {
		this.fulfillmentService = fulfillmentService;
	}

	public Integer getGrams() {
		return grams;
	}

	public void setGrams(Integer grams) {
		this.grams = grams;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getInventoryManagement() {
		return inventoryManagement;
	}

	public void setInventoryManagement(String inventoryManagement) {
		this.inventoryManagement = inventoryManagement;
	}

	public String getInventoryPolicy() {
		return inventoryPolicy;
	}

	public void setInventoryPolicy(String inventoryPolicy) {
		this.inventoryPolicy = inventoryPolicy;
	}

	public Integer getInventoryQuantity() {
		return inventoryQuantity;
	}

	public void setInventoryQuantity(Integer inventoryQuantity) {
		this.inventoryQuantity = inventoryQuantity;
	}

	public String getOption1() {
		return option1;
	}

	public void setOption1(String option1) {
		this.option1 = option1;
	}

	
	public String getOption2() {
		return option2;
	}

	public void setOption2(String option2) {
		this.option2 = option2;
	}

	public String getOption3() {
		return option3;
	}

	public void setOption3(String option3) {
		this.option3 = option3;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Boolean getRequiresShipping() {
		return requiresShipping;
	}

	public void setRequiresShipping(Boolean requiresShipping) {
		this.requiresShipping = requiresShipping;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public Boolean getTaxable() {
		return taxable;
	}

	public void setTaxable(Boolean taxable) {
		this.taxable = taxable;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}	
	
}
