package com.vedoware.shopify.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vedoware.shopify.api.customers.Shop;
import com.vedoware.shopify.api.types.Parameter;
import com.vedoware.shopify.api.utils.RestResourceHandler;
import com.vedoware.shopify.exceptions.ShopifyException;

public class TestShop extends BaseTestClass {
	
	@Test
	public void test() {
		
		List<Parameter> params = new ArrayList<Parameter>();
		
    	// Products
    	try {
    		
    		RestResourceHandler<Shop> shopToTest =
    				new RestResourceHandler<Shop>(devShopRef, Shop.class, serializationMapper, deSerializationMapper);
    		
    		Shop myShop = shopToTest.retrieveResource(params);
    					
			assertTrue(myShop != null);
			assertTrue(!myShop.getName().isEmpty());
			
			// Validate Product Initialization
			//
			System.out.println("Created At=" + myShop.getCreatedAt());

			// Validate serialization
			//
		    try {
				System.out.println("Serialization of receive product");
				System.out.println(serializationMapper.writeValueAsString(myShop));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
			
		} catch (ShopifyException e) {
			e.printStackTrace();
		}
	}

}
