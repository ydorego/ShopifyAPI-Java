package com.vedoware.shopify.api.products;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;


@JsonRootName(value = "productimage")
public class ProductImage implements ShopifyResource {

	@JsonProperty("src")
	private String src;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("position")
	private String position;

	@JsonProperty("product_id")
	private Integer productId;

	@JsonProperty("updated_at")
	private Date updatedAt;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
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

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
		
}
