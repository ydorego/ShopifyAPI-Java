package com.vedoware.shopify.api.customers;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.Address;
import com.vedoware.shopify.api.BaseObject;
import com.vedoware.shopify.api.MetaField;

@JsonRootName("customer")
public class Customer extends BaseObject {
	
	@JsonProperty("accepts_marketing")
	private Boolean acceptsMarketing;

	@JsonProperty("addresses")
	private List<Address> addresses;

	@JsonProperty("default_address")
	private Address defaultAddress;

	@JsonProperty("email")
	private String email;

	@JsonProperty("first_name")
	private String firstName;

	@JsonProperty("metafield")
	private List<MetaField> metafield;

	@JsonProperty("multipass_identifier")
	private String multipassIdentifier;

	@JsonProperty("last_name")
	private String lastName;

	@JsonProperty("last_order_id")
	private Integer lastOrderId;

	@JsonProperty("last_order_name")
	private String lastOrderName;

	@JsonProperty("note")
	private String note;

	@JsonProperty("orders_count")
	private Integer ordersCount;
	
	@JsonProperty("state")
	private String state; // Enum

	@JsonProperty("tags")
	private String tags;

	@JsonProperty("total_spent")
	private Double totalSpent;

	@JsonProperty("verified_email")
	private Boolean verifiedEmail;

	public Boolean getAcceptsMarketing() {
		return acceptsMarketing;
	}

	public void setAcceptsMarketing(Boolean acceptsMarketing) {
		this.acceptsMarketing = acceptsMarketing;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public Address getDefaultAddress() {
		return defaultAddress;
	}

	public void setDefaultAddress(Address defaultAddress) {
		this.defaultAddress = defaultAddress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public List<MetaField> getMetafield() {
		return metafield;
	}

	public void setMetafield(List<MetaField> metafield) {
		this.metafield = metafield;
	}

	public String getMultipassIdentifier() {
		return multipassIdentifier;
	}

	public void setMultipassIdentifier(String multipassIdentifier) {
		this.multipassIdentifier = multipassIdentifier;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getLastOrderId() {
		return lastOrderId;
	}

	public void setLastOrderId(Integer lastOrderId) {
		this.lastOrderId = lastOrderId;
	}

	public String getLastOrderName() {
		return lastOrderName;
	}

	public void setLastOrderName(String lastOrderName) {
		this.lastOrderName = lastOrderName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Integer getOrdersCount() {
		return ordersCount;
	}

	public void setOrdersCount(Integer ordersCount) {
		this.ordersCount = ordersCount;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Double getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(Double totalSpent) {
		this.totalSpent = totalSpent;
	}

	public Boolean getVerifiedEmail() {
		return verifiedEmail;
	}

	public void setVerifiedEmail(Boolean verifiedEmail) {
		this.verifiedEmail = verifiedEmail;
	}
		
}
