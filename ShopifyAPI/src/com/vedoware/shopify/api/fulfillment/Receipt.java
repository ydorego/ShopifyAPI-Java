package com.vedoware.shopify.api.fulfillment;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "receipt")
public class Receipt implements ShopifyResource {

	@JsonProperty("testcase")
	private Boolean testcase;

	@JsonProperty("authorization")
	private Integer authorization;

	public Boolean getTestcase() {
		return testcase;
	}

	public void setTestcase(Boolean testcase) {
		this.testcase = testcase;
	}

	public Integer getAuthorization() {
		return authorization;
	}

	public void setAuthorization(Integer authorization) {
		this.authorization = authorization;
	}

	
}
