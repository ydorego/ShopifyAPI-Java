package com.vedoware.shopify.api.authentication;

import java.util.Scanner;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;

public class TestClientAPI {

	private static final String PROTECTED_RESOURCE_URL = "https://vedo-software-shop.myshopify.com/admin/products.json?oauth_token=";
	private static final Token EMPTY_TOKEN = null;
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OAuthService service = new ServiceBuilder()
        .provider(ShopifyApi.class)
        .apiKey("2856dd64bc6adfd4ba80942dc76e9de3")
        .apiSecret("577b7b734fecc61defde8c8dfd97b2b6")
        .scope("write_products")
        .build();
		
		Scanner in = new Scanner(System.in);

	    System.out.println("=== Foursquare2's OAuth Workflow ===");
	    System.out.println();

	    // Obtain the Authorization URL
	    System.out.println("Fetching the Authorization URL...");
	    String authorizationUrl = service.getAuthorizationUrl(EMPTY_TOKEN);
	    System.out.println("Got the Authorization URL!");
	    System.out.println("Now go and authorize Scribe here:");
	    System.out.println(authorizationUrl);
	    System.out.println("And paste the authorization code here");
	    System.out.print(">>");
	    Verifier verifier = null; //new Verifier(in.nextLine());
	    System.out.println();
	    
//	    System.out.println("Now go and authorize Scribe here:");
//	    System.out.println(service.getAuthorizationUrl(requestToken));
//	    System.out.println("And paste the verifier here");
//	    System.out.print(">>");
//	    Verifier verifier = new Verifier(in.nextLine());
//	    System.out.println();
//
//	    // Trade the Request Token and Verfier for the Access Token
//	    System.out.println("Trading the Request Token for an Access Token...");
//	    Token accessToken = service.getAccessToken(requestToken, verifier);
//	    System.out.println("Got the Access Token!");
//	    System.out.println("(if your curious it looks like this: " + accessToken + " )");
//	    System.out.println();
//	    // Now let's go and ask for a protected resource!
//	    System.out.println("Now we're going to access a protected resource...");
//	    OAuthRequest request = new OAuthRequest(Verb.GET, PROTECTED_RESOURCE_URL + accessToken.getToken());
//	    service.signRequest(accessToken, request);
//
//	    Response response = request.send();
//	    System.out.println("Got it! Lets see what we found...");
//	    System.out.println();
//	    System.out.println(response.getCode());
//	    System.out.println(response.getBody());
//
//	    System.out.println();
//	    System.out.println("Thats it man! Go and build something awesome with Scribe! :)");
	}

}
