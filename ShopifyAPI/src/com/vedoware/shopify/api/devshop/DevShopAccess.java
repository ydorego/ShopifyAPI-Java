package com.vedoware.shopify.api.devshop;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.util.Base64;
//import org.apache.http.HttpResponse;


public class DevShopAccess {

	private static String API_KEY = "2856dd64bc6adfd4ba80942dc76e9de3";
	private static String PASSWORD = "988bf7c149733eb98685fd95028078cd";
	
	private static String myShop = 
			"https://"
			//+ API_KEY
			//+ ":"
			//+ PASSWORD
			+ "vedo-software-shop.myshopify.com/admin";
	
	static final HttpTransport HTTP_TRANSPORT = new NetHttpTransport();
	static final JsonFactory JSON_FACTORY = new JsonFactory();
	
	public static void main(String[] args) {

		try {
			HttpRequestFactory requestFactory =
		        HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
		            @Override
		          public void initialize(HttpRequest request) {
		            	
		            	// Only an option if we plan to parse stream from the
		            	// stream.
		            	//request.setParser((new JsonObjectParser(JSON_FACTORY));
		          }
		        });
		
			String authStr = API_KEY + ":" + PASSWORD;
	        String authEncoded = Base64.encodeBase64String(authStr.getBytes());
	        
		    GenericUrl url = new GenericUrl(myShop + "/products.json");	
		    
		    HttpRequest request = requestFactory.buildGetRequest(url);
		    request.getHeaders().setAuthorization("Basic " + authEncoded);
		    
		    System.out.println(request.getUrl().toString());
		    
		    HttpResponse response = request.execute();

		    System.out.println(response.parseAsString().toString());
		    
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
