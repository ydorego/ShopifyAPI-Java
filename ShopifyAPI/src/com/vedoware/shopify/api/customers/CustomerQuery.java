package com.vedoware.shopify.api.customers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "customerquery")
public class CustomerQuery implements ShopifyResource {

	@JsonProperty("accepts_marketing")
	private Boolean acceptsMarketing;

	@JsonProperty("country")
	private String country;
	
	@JsonProperty("last_abandoned_order_date")
	private String lastAbandonedOrderDate;

	@JsonProperty("last_order_date")
	private String lastOrderDate;
	
	@JsonProperty("orders_count")
	private String ordersCount;

	@JsonProperty("state")
	private String state;

	@JsonProperty("tag")
	private String tag;

	@JsonProperty("total_spent")
	private String totalSpent;

	public Boolean getAcceptsMarketing() {
		return acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLastAbandonedOrderDate() {
		return lastAbandonedOrderDate;
	}

	public void setLastAbandonedOrderDate(String lastAbandonedOrderDate) {
		this.lastAbandonedOrderDate = lastAbandonedOrderDate;
	}

	public String getLastOrderDate() {
		return lastOrderDate;
	}

	public void setLastOrderDate(String lastOrderDate) {
		this.lastOrderDate = lastOrderDate;
	}

	public String getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(String ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(String totalSpent) {
		this.totalSpent = totalSpent;
	}
	
}
