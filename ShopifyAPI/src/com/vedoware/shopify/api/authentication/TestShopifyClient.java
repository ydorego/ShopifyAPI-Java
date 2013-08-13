package com.vedoware.shopify.api.authentication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;

import com.fasterxml.jackson.core.JsonFactory;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestFactory;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.util.Base64;


//import org.apache.http.HttpResponse;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.NTCredentials;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.params.AuthPolicy;
import org.apache.http.impl.client.DefaultHttpClient;


public class TestShopifyClient {

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

//		  try {
//			  
//				DefaultHttpClient httpClient = new DefaultHttpClient();
//				
//				String authStr = API_KEY + ":" + PASSWORD;
//		        String authEncoded = Base64.encodeBase64String(authStr.getBytes());
//		        
//				HttpGet getRequest = new HttpGet(myShop + "/products.json");
//				getRequest.setHeader("Authorization", "Basic " + authEncoded);
//				
//				//getRequest.addHeader("accept", "application/json");
//		 
//				System.out.println(getRequest.getURI().toString());
//								
//				HttpResponse response = httpClient.execute(getRequest);
//		 
//								
//				if (response.getStatusLine().getStatusCode() != 200) {
//					throw new RuntimeException("Failed : HTTP error code : "
//					   + response.getStatusLine().getStatusCode());
//				}
//		 
//				BufferedReader br = new BufferedReader(
//		                         new InputStreamReader((response.getEntity().getContent())));
//		 
//				String output;
//				System.out.println("Output from Server .... \n");
//				while ((output = br.readLine()) != null) {
//					System.out.println(output);
//				}
//		 
//				httpClient.getConnectionManager().shutdown();
//		 
//			  } catch (ClientProtocolException e) {
//		 
//				e.printStackTrace();
//		 
//			  } catch (IOException e) {
//		 
//				e.printStackTrace();
//			  }
//		

		try {
			HttpRequestFactory requestFactory =
		        HTTP_TRANSPORT.createRequestFactory(new HttpRequestInitializer() {
		            @Override
		          public void initialize(HttpRequest request) {
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
		
//		Client client = ClientBuilder.newClient();
//        client = ClientBuilder.newClient();
//        
//        // Developer API
//        //https://API-KEY:PASSWORD@YOUR-TEST-SHOP.myshopify.com/admin/products.json
//        
//        String targetEndpoint = "products.json";
//
//		WebTarget target = client.target(myShop);
//		
//		WebTarget resourceWebTarget = target.path(targetEndpoint);
//		
//		try {
//			
//			System.out.println("URI:" + resourceWebTarget.getUri().toString());
//			System.out.println("URI:" + resourceWebTarget.getConfiguration().getProperties().toString());
//			
//		
//			// Build a HTTP GET request that accepts "text/plain" response type
//		    // and contains a custom HTTP header entry "Foo: bar".
//			Invocation invocation = resourceWebTarget.request().buildGet();
//			
//			// Invoke the request using generic interface
//			   String response = invocation.invoke(String.class);
//			   
//        //String productList = resourceWebTarget.request(MediaType.TEXT_PLAIN).get(String.class); 
//        
//        //Response response = target.request().post(Entity.form(form));
//        
//        //System.out.println("Products List Status:" + productList);
//        //System.out.println("Products List:" + productList.getEntity().toString());
//		} catch (Exception ex) {
//			ex.printStackTrace();
//		}
	}
	
}
