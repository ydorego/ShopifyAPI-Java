package com.vedoware.shopify.api.blog;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.MetaField;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "article")
public class Article implements ShopifyResource {

	@JsonProperty("author")
	private String author;

	@JsonProperty("blog_id")
	private Integer blogId;

	@JsonProperty("body_html")
	private String bodyHtml;

	@JsonProperty("metafield")
	private MetaField metafield;

	@JsonProperty("published")
	private Boolean published;
	
	@JsonProperty("published_at")
	private Date publishedAt;
	
	@JsonProperty("summary_html")
	private String summaryHtml;

	@JsonProperty("tags")
	private String tags;

	@JsonProperty("template_suffix")
	private String templateSuffix;

	@JsonProperty("title")
	private String title;

	@JsonProperty("user_id")
	private Integer userId;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getBlogId() {
		return blogId;
	}

	public void setBlogId(Integer blogId) {
		this.blogId = blogId;
	}

	public String getBodyHtml() {
		return bodyHtml;
	}

	public void setBodyHtml(String bodyHtml) {
		this.bodyHtml = bodyHtml;
	}

	public MetaField getMetafield() {
		return metafield;
	}

	public void setMetafield(MetaField metafield) {
		this.metafield = metafield;
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

	public String getSummaryHtml() {
		return summaryHtml;
	}

	public void setSummaryHtml(String summaryHtml) {
		this.summaryHtml = summaryHtml;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
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

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
		
}
