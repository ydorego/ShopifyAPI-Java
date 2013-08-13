package com.vedoware.shopify.api.products;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.BaseObject;

@JsonRootName(value = "product")
public class Product extends BaseObject {
	
	@JsonProperty("body_html")
	private String bodyHtml;

	@JsonProperty("handle")
	private String handle;

	@JsonProperty("images")
	private List<ProductImage> images;

	@JsonProperty("options")
	private List<Option> options;

	@JsonProperty("product_type")
	private String productType;

	@JsonProperty("published_at")
	private Date publishedAt;

	@JsonProperty("published_scope")
	private String publishedScope;

	@JsonProperty("tags")
	private String tags;
	
	@JsonProperty("template_suffix")
	private String template_suffix;
	
	@JsonProperty("title")
	private String title;

	@JsonProperty("variants")
	private List<ProductVariant> variants;

	@JsonProperty("vendor")
	private String vendor;	
	
	public String getBodyHtml() {
		return bodyHtml;
	}

	public void setBodyHtml(String bodyHtml) {
		this.bodyHtml = bodyHtml;
	}

	public String getHandle() {
		return handle;
	}

	public void setHandle(String handle) {
		this.handle = handle;
	}

	public List<ProductImage> getImages() {
		return images;
	}

	public void setImages(List<ProductImage> images) {
		this.images = images;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public String getPublishedScope() {
		return publishedScope;
	}

	public void setPublishedScope(String publishedScope) {
		this.publishedScope = publishedScope;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	
	public String getTemplate_suffix() {
		return template_suffix;
	}

	public void setTemplate_suffix(String template_suffix) {
		this.template_suffix = template_suffix;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<ProductVariant> getVariants() {
		return variants;
	}

	public void setVariants(List<ProductVariant> variants) {
		this.variants = variants;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	
}
