package com.vedoware.shopify.api;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "page")
public class Page extends BaseObject {

	@JsonProperty("author")
	private String author;
	
	@JsonProperty("body_html")
	private String bodyHtml;
	
	@JsonProperty("handle")
	private String handle;
		
	@JsonProperty("metafield")
	private MetaField metafield;
	
	@JsonProperty("published_at")
	private Date publishedAt;
	
	@JsonProperty("shop_id")
	private Integer shopId;
	
	@JsonProperty("template_suffix")
	private String templateSuffix;
	
	@JsonProperty("title")
	private String title;
	
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

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

	public MetaField getMetafield() {
		return metafield;
	}

	public void setMetafield(MetaField metafield) {
		this.metafield = metafield;
	}

	public Date getPublishedAt() {
		return publishedAt;
	}

	public void setPublishedAt(Date publishedAt) {
		this.publishedAt = publishedAt;
	}

	public Integer getShopId() {
		return shopId;
	}

	public void setShopId(Integer shopId) {
		this.shopId = shopId;
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
