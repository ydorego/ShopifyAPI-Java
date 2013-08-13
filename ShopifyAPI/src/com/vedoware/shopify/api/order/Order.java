package com.vedoware.shopify.api.order;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.Address;
import com.vedoware.shopify.api.BaseObject;
import com.vedoware.shopify.api.LineItem;
import com.vedoware.shopify.api.ShippingLines;
import com.vedoware.shopify.api.customers.Customer;
import com.vedoware.shopify.api.fulfillment.Fulfillment;

@JsonRootName(value = "order")
public class Order extends BaseObject {

	@JsonProperty("billing_address")
	private Address billingAddress;
	
	@JsonProperty("browser_ip")
	private String browserIp;

	@JsonProperty("buyer_accepts_marketing")
	private Boolean buyerAcceptsMarketing;

	@JsonProperty("cancel_reason")
	private String cancelReason;
	
	@JsonProperty("cancelled_at")
	private Date cancelledAt;
	
	@JsonProperty("cart_token")
	private String cartToken;

	@JsonProperty("client_details")
	private ClientDetails clientDetails;
	
	@JsonProperty("currency")
	private String currency;

	@JsonProperty("customer")
	private Customer customer;
	
	@JsonProperty("discount_codes")
	private List<String> discountCodes;
	
	@JsonProperty("email")
	private String email;
	
	@JsonProperty("financial_status")
	private String financialStatus;
	
	@JsonProperty("fulfillments")
	private List<Fulfillment> fulfillments;
	
	@JsonProperty("fulfillment_status")
	private String fulfillmentStatus;
	
	@JsonProperty("gateway")
	private String gateway;
	
	@JsonProperty("landing_site")
	private String landingSite;
	
	@JsonProperty("line_items")
	private List<LineItem> lineItems;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("note")
	private String note;
	
	@JsonProperty("note_attributes")
	private String noteAttributes;
	
	@JsonProperty("number")
	private String number;
	
	@JsonProperty("order_number")
	private Integer orderNumber;
	
	@JsonProperty("payment_details")
	private PaymentDetails paymentDetails;
	
	@JsonProperty("processing_method")
	private String processingMethod;
	
	@JsonProperty("referring_site")
	private String referringSite;
	
	@JsonProperty("shipping_address")
	private Address shippingAddress;
	
	@JsonProperty("shipping_lines")
	private ShippingLines shippingLines;
	
	@JsonProperty("subtotal_price")
	private Double subtotalPrice;
	
	@JsonProperty("tax_lines")
	private TaxLines taxLines;
	
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

	public String getBrowserIp() {
		return browserIp;
	}

	public void setBrowserIp(String browserIp) {
		this.browserIp = browserIp;
	}

	public Boolean getBuyerAcceptsMarketing() {
		return buyerAcceptsMarketing;
	}

	public void setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
		this.buyerAcceptsMarketing = buyerAcceptsMarketing;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Date getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(Date cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public String getCartToken() {
		return cartToken;
	}

	public void setCartToken(String cartToken) {
		this.cartToken = cartToken;
	}

	public ClientDetails getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(ClientDetails clientDetails) {
		this.clientDetails = clientDetails;
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

	public List<String> getDiscountCodes() {
		return discountCodes;
	}

	public void setDiscountCodes(List<String> discountCodes) {
		this.discountCodes = discountCodes;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFinancialStatus() {
		return financialStatus;
	}

	public void setFinancialStatus(String financialStatus) {
		this.financialStatus = financialStatus;
	}

	public List<Fulfillment> getFulfillments() {
		return fulfillments;
	}

	public void setFulfillments(List<Fulfillment> fulfillments) {
		this.fulfillments = fulfillments;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public void setFulfillmentStatus(String fulfillmentStatus) {
		this.fulfillmentStatus = fulfillmentStatus;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteAttributes() {
		return noteAttributes;
	}

	public void setNoteAttributes(String noteAttributes) {
		this.noteAttributes = noteAttributes;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Integer getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(Integer orderNumber) {
		this.orderNumber = orderNumber;
	}

	public PaymentDetails getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(PaymentDetails paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public String getProcessingMethod() {
		return processingMethod;
	}

	public void setProcessingMethod(String processingMethod) {
		this.processingMethod = processingMethod;
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

	public TaxLines getTaxLines() {
		return taxLines;
	}

	public void setTaxLines(TaxLines taxLines) {
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
