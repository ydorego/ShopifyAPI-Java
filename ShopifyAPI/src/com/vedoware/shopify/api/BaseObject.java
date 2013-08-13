package com.vedoware.shopify.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class BaseObject implements ShopifyResource {
	
	@JsonProperty("created_at")
	private Date createdAt;
	
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("updated_at")
	private Date updatedAt;

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

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
