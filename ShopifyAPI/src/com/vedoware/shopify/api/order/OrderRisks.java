package com.vedoware.shopify.api.order;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.vedoware.shopify.api.ShopifyResource;

@JsonRootName(value = "orderrisks")
public class OrderRisks implements ShopifyResource {

	@JsonProperty("cause_cancel")
	private Boolean causeCancel;

	@JsonProperty("display")
	private Boolean display;
	
	@JsonProperty("id")
	private Integer id;

	@JsonProperty("message")
	private String message;

	@JsonProperty("recommendation")
	private String recommendation;
	
	@JsonProperty("score")
	private Double score;

	@JsonProperty("source")
	private String source;

	public Boolean getCauseCancel() {
		return causeCancel;
	}

	public void setCauseCancel(Boolean causeCancel) {
		this.causeCancel = causeCancel;
	}

	public Boolean getDisplay() {
		return display;
	}

	public void setDisplay(Boolean display) {
		this.display = display;
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

	public String getRecommendation() {
		return recommendation;
	}

	public void setRecommendation(String recommendation) {
		this.recommendation = recommendation;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
		
}
