package com.vedoware.shopify.api.types;

public class OperationStatus {

	private final int status;
	private final String statusMessage;
	
	
	public OperationStatus(int status, String statusMessage) {
		super();
		this.status = status;
		this.statusMessage = statusMessage;
	}


	public int getStatus() {
		return status;
	}


	public String getStatusMessage() {
		return statusMessage;
	}
	
	
}
