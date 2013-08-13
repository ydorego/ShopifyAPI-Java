package com.vedoware.shopify.api.products;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.BaseObject;
import com.vedoware.shopify.api.MetaField;

@JsonRootName(value = "customcollection")
public class CustomCollection extends BaseObject {

	@JsonProperty("body_html")
	private String bodyHtml;

	@JsonProperty("handle")
	private String handle;

	@JsonProperty("image")
	private String image;
	
	@JsonProperty("metafield")
	private MetaField metaField;

	@JsonProperty("published")
	private Boolean published;

	@JsonProperty("published_at")
	private Date publishedAt;

	@JsonProperty("published_scope")
	private String publishedScope;

	@JsonProperty("sort_order")
	private String sortOrder;

	@JsonProperty("template_suffix")
	private String templateSuffix;

	@JsonProperty("title")
	private String title;

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public MetaField getMetaField() {
		return metaField;
	}

	public void setMetaField(MetaField metaField) {
		this.metaField = metaField;
	}

	public Boolean getPublished() {
		return published;
	}

	public void setPublished(Boolean published) {
		this.published = published;
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

	public String getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTemplateSuffix() {
		return templateSuffix;
	}

	public void setTemplateSuffix(String templateSuffix) {
		this.templateSuffix = templateSuffix;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}	
	
}
