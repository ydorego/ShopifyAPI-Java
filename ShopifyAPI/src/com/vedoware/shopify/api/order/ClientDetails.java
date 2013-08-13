package com.vedoware.shopify.api.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "clientdetails")
public class ClientDetails implements ShopifyResource {

	@JsonProperty("accept_language")
	private String acceptLanguage;

	@JsonProperty("browser_ip")
	private String browserIp;

	@JsonProperty("session_hash")
	private String sessionHash;

	@JsonProperty("user_agent")
	private String userAgent;

	public String getAcceptLanguage() {
		return acceptLanguage;
	}

	public void setAcceptLanguage(String acceptLanguage) {
		this.acceptLanguage = acceptLanguage;
	}

	public String getBrowserIp() {
		return browserIp;
	}

	public void setBrowserIp(String browserIp) {
		this.browserIp = browserIp;
	}

	public String getSessionHash() {
		return sessionHash;
	}

	public void setSessionHash(String sessionHash) {
		this.sessionHash = sessionHash;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}
		
}
