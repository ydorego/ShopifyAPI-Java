package com.vedoware.shopify.test;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.Before;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vedoware.shopify.api.devshop.DevShopAccessService;

public abstract class BaseTestClass {

	private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SZ");
	private static String API_KEY = "2856dd64bc6adfd4ba80942dc76e9de3";
	private static String PASSWORD = "988bf7c149733eb98685fd95028078cd";
	
	private static String baseShopUrl = 
			"https://" + "vedo-software-shop.myshopify.com/admin";

	protected DevShopAccessService devShopRef = null;
	protected ObjectMapper deSerializationMapper = null;
	protected ObjectMapper serializationMapper = null;

	@Before
	public void setUp() throws Exception {
		
		devShopRef = new DevShopAccessService(API_KEY, PASSWORD, baseShopUrl);  		

		// Handle the date format serialization specifically
		//
		serializationMapper = new ObjectMapper();
		serializationMapper.enable(SerializationFeature.INDENT_OUTPUT);
		serializationMapper.setDateFormat(dateFormat);	
		
		// Nothing special for the de-serialization
		//
		deSerializationMapper = new ObjectMapper();
	    
	}

	@After
	public void tearDown() throws Exception {
	}
	
}
