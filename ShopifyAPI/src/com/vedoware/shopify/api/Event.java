package com.vedoware.shopify.api;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "event")
public class Event implements ShopifyResource {

	@JsonProperty("arguments")
	private List<String> arguments;

	@JsonProperty("body")
	private String body;

	@JsonProperty("created_at")
	private Date createdAt;

	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("message")
	private String message;

	@JsonProperty("subject_id")
	private Integer subjectId;
	
	@JsonProperty("subject_type")
	private String subjectType;

	@JsonProperty("verb")
	private String verb;

	public List<String> getArguments() {
		return arguments;
	}

	public void setArguments(List<String> arguments) {
		this.arguments = arguments;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Integer subjectId) {
		this.subjectId = subjectId;
	}

	public String getSubjectType() {
		return subjectType;
	}

	public void setSubjectType(String subjectType) {
		this.subjectType = subjectType;
	}

	public String getVerb() {
		return verb;
	}

	public void setVerb(String verb) {
		this.verb = verb;
	}
		
}
