package com.vedoware.shopify.api.blog;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.BaseObject;
import com.vedoware.shopify.api.MetaField;

@JsonRootName(value = "blog")
public class Blog extends BaseObject{

	@JsonProperty("commentable")
	private String commentable;

	@JsonProperty("feedburner")
	private String feedburner;

	@JsonProperty("feedburner_location")
	private String feedburnerLocation; //URL

	@JsonProperty("handle")
	private String handle;
	
	@JsonProperty("metafield")
	private MetaField metafield;
	
	@JsonProperty("tags")
	private String tags;

	@JsonProperty("template_suffix")
	private String templateSuffix;

	@JsonProperty("title")
	private String title;

	public String getCommentable() {
		return commentable;
	}

	public void setCommentable(String commentable) {
		this.commentable = commentable;
	}

	public String getFeedburner() {
		return feedburner;
	}

	public void setFeedburner(String feedburner) {
		this.feedburner = feedburner;
	}

	public String getFeedburnerLocation() {
		return feedburnerLocation;
	}

	public void setFeedburnerLocation(String feedburnerLocation) {
		this.feedburnerLocation = feedburnerLocation;
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
	
}
