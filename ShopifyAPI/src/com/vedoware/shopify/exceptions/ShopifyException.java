package com.vedoware.shopify.exceptions;

public class ShopifyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2603165665652307915L;

    public ShopifyException() {
        super();
    }

    public ShopifyException(String message) {
        super(message);
    }

    public ShopifyException(Exception exception) {
        super(exception);
    }

    public ShopifyException(String message, Throwable exception) {
        super(message, exception);
    }
    
}
