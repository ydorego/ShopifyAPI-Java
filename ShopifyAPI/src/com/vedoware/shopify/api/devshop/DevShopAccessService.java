package com.vedoware.shopify.api.devshop;

import java.util.List;

import com.google.api.client.http.ByteArrayContent;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.Base64;
import com.vedoware.shopify.api.types.OperationStatus;
import com.vedoware.shopify.api.types.Parameter;
import com.vedoware.shopify.exceptions.ShopifyException;


public class DevShopAccessService {

	private static String API_KEY = "2856dd64bc6adfd4ba80942dc76e9de3";
	private static String PASSWORD = "988bf7c149733eb98685fd95028078cd";
	
	private static String baseShopUrl = 
			"https://" + "vedo-software-shop.myshopify.com/admin";
	
	private static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();	
	private static HttpRequestFactory _requestFactory = null;
	private String encodedAuthentication = null;	
	private final String apiKey;
	
	public DevShopAccessService(String apiKey, String password, String shopAdminAddress) {

		this.apiKey = apiKey;
		
		// Initial Request Factory
		//
		_requestFactory =
		        HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
		            @Override
		          public void initialize(HttpRequest request) {	
		            	//request.getHeaders().put("Content-Type", "application/json");
		            	// Only an option if we plan to parse stream from the
		            	// stream.
		            	//request.setParser((new JsonObjectParser(JSON_FACTORY));
		          }
		        });
		
		String authStr = this.apiKey + ":" + PASSWORD;
		encodedAuthentication = Base64.encodeBase64String(authStr.getBytes());
	
	}
		
	
	public String getShopResource(String targetResource, List<Parameter> parameters) 
			throws ShopifyException {

		try {

		    GenericUrl url = processParameters(targetResource, parameters);	
		    		    			
		    HttpRequest request = _requestFactory.buildGetRequest(url);
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());
		    
		    HttpResponse response = request.execute();

		    return response.parseAsString();
		    
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ShopifyException(ex);
		}
		
	}

	public String searchShopResource(String targetResource, List<Parameter> parameters) 
			throws ShopifyException {

		try {

		    // Process the query parameters
		    //
		    if (parameters == null || parameters.isEmpty()) {
		    	throw new ShopifyException("Query parameters can not be null or empty");
		    }
		    
		    //
		    StringBuilder queryString = new StringBuilder("?");
		    for (Parameter curParam : parameters) {
		    	queryString.append(curParam.getName().toLowerCase() + "=" + curParam.getValue() + "&");
		    }
		
		    GenericUrl url = new GenericUrl(baseShopUrl + "/" + 
		    						targetResource + ".json" + 
		    						queryString.substring(0, queryString.lastIndexOf("&")));	
		    		    
		    
		    HttpRequest request = _requestFactory.buildGetRequest(url);
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());
		    
		    HttpResponse response = request.execute();

		    return response.parseAsString();
		    
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ShopifyException(ex);
		}
		
	}
	
	public String createShopResource(String targetResource, List<Parameter> parameters, String resourcePayload) 
			throws ShopifyException {

		try {
			
		    GenericUrl url = processParameters(targetResource, parameters);	
					    	
		    // HttpContent
		    //
		    ByteArrayContent contentBytes = new ByteArrayContent(null, resourcePayload.getBytes());
		    
		    // Post Request
		    //
		    HttpRequest request = _requestFactory.buildPostRequest(url, contentBytes);
		    request.getHeaders().setContentType("application/json");
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());		    
		    HttpResponse response = request.execute();

		    return response.parseAsString();
		    
		} catch (Exception ex) {
			throw new ShopifyException(ex);
		}		
	}

	public String updateShopResource(String targetResource, List<Parameter> parameters, String resourcePayload) 
			throws ShopifyException {

		try {
			
		    GenericUrl url = processParameters(targetResource, parameters);	
					    	
		    // HttpContent
		    //
		    ByteArrayContent contentBytes = new ByteArrayContent(null, resourcePayload.getBytes());
		    
		    // Post Request
		    //
		    HttpRequest request = _requestFactory.buildPutRequest(url, contentBytes);
		    request.getHeaders().setContentType("application/json");
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());		    
		    HttpResponse response = request.execute();

		    return response.parseAsString();
		    
		} catch (Exception ex) {
			throw new ShopifyException(ex);
		}		
	}

	public OperationStatus deleteShopResource(String targetResource, List<Parameter> parameters) 
			throws ShopifyException {

		try {
		
		    GenericUrl url = processParameters(targetResource, parameters);	
					    
		    HttpRequest request = _requestFactory.buildDeleteRequest(url);
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());
		    
		    HttpResponse response = request.execute();

		    OperationStatus operationStatus = 
		    		new OperationStatus(response.getStatusCode(), response.getStatusMessage());
		    
		    return operationStatus;
		    
		} catch (Exception ex) {
			ex.printStackTrace();
			throw new ShopifyException(ex);
		}
		
	}

	public String patchShopResource(String targetResource, List<Parameter> parameters, String resourcePayload) 
			throws ShopifyException {

		try {
			
		    GenericUrl url = processParameters(targetResource, parameters);	
					    	
		    // HttpContent
		    //
		    ByteArrayContent contentBytes = new ByteArrayContent(null, resourcePayload.getBytes());
		    
		    // Post Request
		    //
		    HttpRequest request = _requestFactory.buildPatchRequest(url, contentBytes);
		    request.getHeaders().setContentType("application/json");
		    request.getHeaders().setAuthorization("Basic " + encodedAuthentication);
		    
		    System.out.println(request.getUrl().toString());		    
		    HttpResponse response = request.execute();

		    return response.parseAsString();
		    
		} catch (Exception ex) {
			throw new ShopifyException(ex);
		}		
	}

	private GenericUrl processParameters(String targetResource, List<Parameter> parameters) {
		
		// Process the query parameters
		//
		StringBuilder paramString = new StringBuilder();
		if (parameters != null && !parameters.isEmpty()) {

		    //
		    for (Parameter curParam : parameters) {
		    	paramString.append(curParam.getName().toLowerCase() + "=" + curParam.getValue() + "&");
		    }
		}
		
		GenericUrl url = new GenericUrl(baseShopUrl + "/" + 
								targetResource + ".json" + 
								(paramString.length() > 0 ? "?" + paramString.substring(0, paramString.lastIndexOf("&")) : ""));

		return url;
		
	}
		
}
