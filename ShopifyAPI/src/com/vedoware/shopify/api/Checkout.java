package com.vedoware.shopify.api;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.customers.Customer;

@JsonRootName(value = "checkout")
public class Checkout implements ShopifyResource {

	@JsonProperty("billing_address")
	private Address billingAddress;

	@JsonProperty("buyer_accepts_marketing")
	private String buyerAcceptsMarketing;

	@JsonProperty("cancel_reason")
	private String cancelReason;

	@JsonProperty("cart_token")
	private String cartToken;

	@JsonProperty("closed_at")
	private Date closedAt;

	@JsonProperty("completed_at")
	private Date completedAt;

	@JsonProperty("currency")
	private String currency;

	@JsonProperty("customer")
	private Customer customer;

	@JsonProperty("discount_codes")
	private String discountCodes;

	@JsonProperty("email")
	private String email;

	@JsonProperty("gateway")
	private String gateway;

	@JsonProperty("landing_site")
	private String landingSite;

	@JsonProperty("lineItems")
	private List<LineItem> lineItems;

	@JsonProperty("note")
	private String note;

	@JsonProperty("referring_site")
	private String referringSite;

	@JsonProperty("shipping_address")
	private Address shippingAddress;

	@JsonProperty("shippingLines")
	private ShippingLines shippingLines;

	@JsonProperty("subtotal_price")
	private Double subtotalPrice;

	@JsonProperty("tax_lines")
	private List<TaxLine> taxLines;

	@JsonProperty("taxes_included")
	private Boolean taxesIncluded;

	@JsonProperty("token")
	private String token;

	@JsonProperty("total_discounts")
	private Double totalDiscounts;

	@JsonProperty("total_line_items_price")
	private Double totalLineItemsPrice;

	@JsonProperty("total_price")
	private Double totalPrice;

	@JsonProperty("total_tax")
	private Double totalTax;

	@JsonProperty("total_weight")
	private Double totalWeight;

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public String getBuyerAcceptsMarketing() {
		return buyerAcceptsMarketing;
	}

	public void setBuyerAcceptsMarketing(String buyerAcceptsMarketing) {
		this.buyerAcceptsMarketing = buyerAcceptsMarketing;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public String getCartToken() {
		return cartToken;
	}

	public void setCartToken(String cartToken) {
		this.cartToken = cartToken;
	}

	public Date getClosedAt() {
		return closedAt;
	}

	public void setClosedAt(Date closedAt) {
		this.closedAt = closedAt;
	}

	public Date getCompletedAt() {
		return completedAt;
	}

	public void setCompletedAt(Date completedAt) {
		this.completedAt = completedAt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getDiscountCodes() {
		return discountCodes;
	}

	public void setDiscountCodes(String discountCodes) {
		this.discountCodes = discountCodes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGateway() {
		return gateway;
	}

	public void setGateway(String gateway) {
		this.gateway = gateway;
	}

	public String getLandingSite() {
		return landingSite;
	}

	public void setLandingSite(String landingSite) {
		this.landingSite = landingSite;
	}

	public List<LineItem> getLineItems() {
		return lineItems;
	}

	public void setLineItems(List<LineItem> lineItems) {
		this.lineItems = lineItems;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getReferringSite() {
		return referringSite;
	}

	public void setReferringSite(String referringSite) {
		this.referringSite = referringSite;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public ShippingLines getShippingLines() {
		return shippingLines;
	}

	public void setShippingLines(ShippingLines shippingLines) {
		this.shippingLines = shippingLines;
	}

	public Double getSubtotalPrice() {
		return subtotalPrice;
	}

	public void setSubtotalPrice(Double subtotalPrice) {
		this.subtotalPrice = subtotalPrice;
	}

	public List<TaxLine> getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(List<TaxLine> taxLines) {
		this.taxLines = taxLines;
	}

	public Boolean getTaxesIncluded() {
		return taxesIncluded;
	}

	public void setTaxesIncluded(Boolean taxesIncluded) {
		this.taxesIncluded = taxesIncluded;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Double getTotalDiscounts() {
		return totalDiscounts;
	}

	public void setTotalDiscounts(Double totalDiscounts) {
		this.totalDiscounts = totalDiscounts;
	}

	public Double getTotalLineItemsPrice() {
		return totalLineItemsPrice;
	}

	public void setTotalLineItemsPrice(Double totalLineItemsPrice) {
		this.totalLineItemsPrice = totalLineItemsPrice;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Double getTotalTax() {
		return totalTax;
	}

	public void setTotalTax(Double totalTax) {
		this.totalTax = totalTax;
	}

	public Double getTotalWeight() {
		return totalWeight;
	}

	public void setTotalWeight(Double totalWeight) {
		this.totalWeight = totalWeight;
	}
	
}
