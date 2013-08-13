package com.vedoware.shopify.api.authentication;

import org.scribe.builder.api.DefaultApi20;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.extractors.JsonTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;

public class ShopifyApi extends DefaultApi20 {

	  //private static final String AUTHORIZATION_URL = "https://foursquare.com/oauth2/authenticate?client_id=%s&response_type=code&redirect_uri=%s";	  
	  private static final String SHOP_AUTHORIZATION_URL = "https://vedo-software-shop.myshopify.com/admin/oauth/authorize?client_id=%s&scope=%s";
		  
	  @Override
	  public String getAccessTokenEndpoint() {
		  return "https://vedo-software-shop.myshopify.com/app?code=TEMP_TOKEN";
	    //return "https://foursquare.com/oauth2/access_token?grant_type=authorization_code";
	  }

	  @Override
	  public String getAuthorizationUrl(OAuthConfig config)
	  {
	    //Preconditions.checkValidUrl(config.getCallback(), "Must provide a valid url as callback. Foursquare2 does not support OOB");
	    
		  return String.format(SHOP_AUTHORIZATION_URL, 
				  			config.getApiKey(), 
				  			config.getScope());
	  }

	  @Override
	  public AccessTokenExtractor getAccessTokenExtractor()
	  {
	    return new JsonTokenExtractor();
	  }
	
}
