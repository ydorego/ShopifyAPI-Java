package com.vedoware.shopify.api.utils;

import com.vedoware.shopify.api.ShopifyResource;

public class ResourceData {

	private final Class<? extends ShopifyResource> clazz;
	private final String urlSuffix;
	
	public ResourceData(Class<? extends ShopifyResource> clazz, String urlSuffix) {
		super();
		this.clazz = clazz;
		this.urlSuffix = urlSuffix;
	}

	public Class<? extends ShopifyResource> getClazz() {
		return clazz;
	}

	public String getUrlSuffix() {
		return urlSuffix;
	}
	
	
}
