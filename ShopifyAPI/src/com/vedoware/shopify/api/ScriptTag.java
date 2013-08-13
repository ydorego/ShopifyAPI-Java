package com.vedoware.shopify.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "scriptTag")
public class ScriptTag extends BaseObject {

	@JsonProperty("event")
	private String event;
	
	@JsonProperty("src")
	private String src;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}
	
}
