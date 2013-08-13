package com.vedoware.shopify.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "carrierService")
public class CarrierService implements ShopifyResource {
	
	@JsonProperty("active")
	private Boolean active;
	
	@JsonProperty("callback_url")
	private String callbackUrl;
	
	@JsonProperty("carrier_service_type")
	private String carrierServiceType;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("service_discovery")
	private Boolean serviceDiscovery;

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public String getCarrierServiceType() {
		return carrierServiceType;
	}

	public void setCarrierServiceType(String carrierServiceType) {
		this.carrierServiceType = carrierServiceType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getServiceDiscovery() {
		return serviceDiscovery;
	}

	public void setServiceDiscovery(Boolean serviceDiscovery) {
		this.serviceDiscovery = serviceDiscovery;
	}
	
}
