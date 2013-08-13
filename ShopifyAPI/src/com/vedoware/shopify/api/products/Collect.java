package com.vedoware.shopify.api.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "collect")
public class Collect implements ShopifyResource {

	@JsonProperty("collection_id")
	private Integer collectionId;

	@JsonProperty("featured")
	private Boolean featured;

	@JsonProperty("position")
	private Integer position;

	@JsonProperty("product_id")
	private Integer productId;

	@JsonProperty("sort_value")
	private Integer sortValue;

	public Integer getCollectionId() {
		return collectionId;
	}

	public void setCollectionId(Integer collectionId) {
		this.collectionId = collectionId;
	}

	public Boolean getFeatured() {
		return featured;
	}

	public void setFeatured(Boolean featured) {
		this.featured = featured;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getSortValue() {
		return sortValue;
	}

	public void setSortValue(Integer sortValue) {
		this.sortValue = sortValue;
	}
		
}
