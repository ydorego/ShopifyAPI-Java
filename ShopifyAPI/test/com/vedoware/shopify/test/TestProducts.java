package com.vedoware.shopify.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vedoware.shopify.api.Count;
import com.vedoware.shopify.api.products.Product;
import com.vedoware.shopify.api.types.OperationStatus;
import com.vedoware.shopify.api.types.Parameter;
import com.vedoware.shopify.api.utils.RestResourceHandler;
import com.vedoware.shopify.exceptions.ShopifyException;

public class TestProducts  extends BaseTestClass {


	@Test
	public void test() {
		
		List<Parameter> params = new ArrayList<Parameter>();
		
    	// Products
    	try {
    		
    		RestResourceHandler<Product> productToTest =
    				new RestResourceHandler<Product>(devShopRef, Product.class, serializationMapper, deSerializationMapper);
    		
    		List<Product> myProducts = productToTest.retrieveResources(params);
    					
			assertTrue(myProducts != null);
			assertTrue(!myProducts.isEmpty());
			
			System.out.println("*** Number of Products:" + myProducts.size());
			
			// Validate Product Initialization
			//
			Product lastProduct = myProducts.get(myProducts.size()-1);
			
			System.out.println("Created At=" + lastProduct.getCreatedAt());

			// Validate serialization
			//
		    try {
				System.out.println("Serialization of receive product");
				System.out.println(serializationMapper.writeValueAsString(lastProduct));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		    
		    // Create another product based on the newly created product...
		    //
		    try {
		    	lastProduct.setTitle("New Product from API (Position=" + (myProducts.size()+1) + ")");
		    	Product myNewProduct = productToTest.createResource("product", params, lastProduct);
		    					
				System.out.println("Created At=" + myNewProduct.getCreatedAt());

		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }
    		

		    // Modify the newly created product
		    //
		    try {
		    	lastProduct.setTitle("New Product from API (Position=" + myProducts.size()+1 + " Modified)");
		    	Product updatedProduct = productToTest.updateResource("product", lastProduct.getId(), params, lastProduct);
		    					
				System.out.println("Created At=" + updatedProduct.getCreatedAt());
				System.out.println("Updated At=" + updatedProduct.getUpdatedAt());

		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }

		    // Let's delete the last entry
		    //
		    try {
		    	OperationStatus deleteStatus = productToTest.deleteResource(lastProduct.getId(), params, lastProduct);
		    					
				System.out.println("Deletion Status Code:" + deleteStatus.getStatus());
				System.out.println("Deletion Status Message:" + deleteStatus.getStatusMessage());

		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }

		    // Let's get the number of products
		    //
		    try {
		    	Count productCount = productToTest.countResources(params);
		    					
				System.out.println("Total Number of Products:" + productCount.getCount());

		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }
		    
		} catch (ShopifyException e) {
			e.printStackTrace();
		}
	}

}
