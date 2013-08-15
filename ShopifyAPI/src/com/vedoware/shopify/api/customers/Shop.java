package com.vedoware.shopify.api.customers;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "shop")
public class Shop implements ShopifyResource {

	@JsonProperty("address1")
	private String address1;

	@JsonProperty("city")
	private String city;

	@JsonProperty("country")
	private String country;

	@JsonProperty("country_code")
	private String countryCode;

	@JsonProperty("country_name")
	private String countryName;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("customer_email")
	private String customerEmail;

	@JsonProperty("currency")
	private  String currency;

	@JsonProperty("domain")
	private String domain;

	@JsonProperty("email")
	private String email;

	@JsonProperty("eligible_for_payments")
	private Boolean eligibleForPayments;
	
	@JsonProperty("requires_extra_payments_agreement")
	private Boolean requiresExtraPaymentsAgreement;
	
	@JsonProperty("google_apps_domain")
	private String googleAppsDomain;

	@JsonProperty("google_apps_login_enabled")
	private Boolean googleAppsLoginEnabled;

	@JsonProperty("id")
	private Integer id;

	@JsonProperty("latitude")
	private String latitude;

	@JsonProperty("longitude")
	private String longitude;

	@JsonProperty("money_format")
	private String moneyFormat;

	@JsonProperty("money_in_emails_format")
	private String moneyInEmailsFormat;

	@JsonProperty("money_with_currency_in_emails_format")
	private String moneyWithCurrencyInEmailsFormat;
		
	@JsonProperty("money_with_currency_format")
	private String moneyWithCurrencyFormat;

	@JsonProperty("myshopify_domain")
	private String myShopifyDomain;

	@JsonProperty("name")
	private String name;

	@JsonProperty("plan_name")
	private String planName;

	@JsonProperty("display_plan_name")
	private String displayPlanName;
	
	@JsonProperty("phone")
	private String phone;

	@JsonProperty("plan_display_name")
	private String planDisplayName;	
	
	@JsonProperty("province")
	private String province;

	@JsonProperty("public")
	private Boolean publicShop;
	
	@JsonProperty("primary_location_id")
	private Integer primaryLocationId;
	
	@JsonProperty("province_code")
	private String provinceCode;

	@JsonProperty("publicString")
	private String publicString;

	@JsonProperty("shop_owner")
	private String shopOwner;

	@JsonProperty("source")
	private String source;

	@JsonProperty("tax_shipping")
	private Boolean taxShipping;

	@JsonProperty("taxes_included")
	private Boolean taxesIncluded;

	@JsonProperty("timezone")
	private String timezone;

	@JsonProperty("zip")
	private String zip;

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGoogleAppsDomain() {
		return googleAppsDomain;
	}

	public void setGoogleAppsDomain(String googleAppsDomain) {
		this.googleAppsDomain = googleAppsDomain;
	}

	public Boolean getGoogleAppsLoginEnabled() {
		return googleAppsLoginEnabled;
	}

	public void setGoogleAppsLoginEnabled(Boolean googleAppsLoginEnabled) {
		this.googleAppsLoginEnabled = googleAppsLoginEnabled;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMoneyFormat() {
		return moneyFormat;
	}

	public void setMoneyFormat(String moneyFormat) {
		this.moneyFormat = moneyFormat;
	}

	public String getMoneyWithCurrencyFormat() {
		return moneyWithCurrencyFormat;
	}

	public void setMoneyWithCurrencyFormat(String moneyWithCurrencyFormat) {
		this.moneyWithCurrencyFormat = moneyWithCurrencyFormat;
	}

	public String getMyShopifyDomain() {
		return myShopifyDomain;
	}

	public void setMyShopifyDomain(String myShopifyDomain) {
		this.myShopifyDomain = myShopifyDomain;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getDisplayPlanName() {
		return displayPlanName;
	}

	public void setDisplayPlanName(String displayPlanName) {
		this.displayPlanName = displayPlanName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	
	public Integer getPrimaryLocationId() {
		return primaryLocationId;
	}

	public void setPrimaryLocationId(Integer primaryLocationId) {
		this.primaryLocationId = primaryLocationId;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getPublicString() {
		return publicString;
	}

	public void setPublicString(String publicString) {
		this.publicString = publicString;
	}

	public String getShopOwner() {
		return shopOwner;
	}

	public void setShopOwner(String shopOwner) {
		this.shopOwner = shopOwner;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Boolean getTaxShipping() {
		return taxShipping;
	}

	public void setTaxShipping(Boolean taxShipping) {
		this.taxShipping = taxShipping;
	}

	public Boolean getTaxesIncluded() {
		return taxesIncluded;
	}

	public void setTaxesIncluded(Boolean taxesIncluded) {
		this.taxesIncluded = taxesIncluded;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Boolean getPublicShop() {
		return publicShop;
	}

	public void setPublicShop(Boolean publicShop) {
		this.publicShop = publicShop;
	}

	public String getPlanDisplayName() {
		return planDisplayName;
	}

	public void setPlanDisplayName(String planDisplayName) {
		this.planDisplayName = planDisplayName;
	}

	public String getMoneyInEmailsFormat() {
		return moneyInEmailsFormat;
	}

	public void setMoneyInEmailsFormat(String moneyInEmailsFormat) {
		this.moneyInEmailsFormat = moneyInEmailsFormat;
	}

	public String getMoneyWithCurrencyInEmailsFormat() {
		return moneyWithCurrencyInEmailsFormat;
	}

	public void setMoneyWithCurrencyInEmailsFormat(
			String moneyWithCurrencyInEmailsFormat) {
		this.moneyWithCurrencyInEmailsFormat = moneyWithCurrencyInEmailsFormat;
	}
	
}
