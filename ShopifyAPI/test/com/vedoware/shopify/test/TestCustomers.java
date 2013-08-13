package com.vedoware.shopify.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.vedoware.shopify.api.Count;
import com.vedoware.shopify.api.customers.Customer;
import com.vedoware.shopify.api.types.Parameter;
import com.vedoware.shopify.api.utils.RestResourceHandler;
import com.vedoware.shopify.exceptions.ShopifyException;

public class TestCustomers  extends BaseTestClass {

	@Test
	public void test() {
		
		List<Parameter> params = new ArrayList<Parameter>();
		
    	// Customers
    	try {
    		
    		RestResourceHandler<Customer> customerToTest =
    				new RestResourceHandler<Customer>(devShopRef, Customer.class, serializationMapper, deSerializationMapper);
    		
    		List<Customer> myCustomers = customerToTest.retrieveResources(params);
    					
			assertTrue(myCustomers != null);
			assertTrue(!myCustomers.isEmpty());
			
			System.out.println("*** Number of Customers:" + myCustomers.size());
			
			// Validate Customer Initialization
			//
			Customer lastCustomer = myCustomers.get(myCustomers.size()-1);
			
			System.out.println("Created At=" + lastCustomer.getCreatedAt());

			// Validate serialization
			//
		    try {
				System.out.println("Serialization of receive customer");
				System.out.println(serializationMapper.writeValueAsString(lastCustomer));
			} catch (JsonProcessingException e) {
				e.printStackTrace();
			}
		    
//		    // Create another customer based on the newly created customer...
//		    //
//		    try {
//		    	lastCustomer.setTitle("New Customer from API (Position=" + (myCustomers.size()+1) + ")");
//		    	Customer myNewCustomer = customerToTest.createResource("customer", params, lastCustomer);
//		    					
//				System.out.println("Created At=" + myNewCustomer.getCreatedAt());
//
//		    } catch (Exception ex) {
//		    	ex.printStackTrace();
//		    }
//    		
//
//		    // Modify the newly created customer
//		    //
//		    try {
//		    	lastCustomer.setTitle("New Customer from API (Position=" + myCustomers.size()+1 + " Modified)");
//		    	Customer updatedCustomer = customerToTest.updateResource("customer", lastCustomer.getId(), params, lastCustomer);
//		    					
//				System.out.println("Created At=" + updatedCustomer.getCreatedAt());
//				System.out.println("Updated At=" + updatedCustomer.getUpdatedAt());
//
//		    } catch (Exception ex) {
//		    	ex.printStackTrace();
//		    }
//
//		    // Let's delete the last entry
//		    //
//		    try {
//		    	OperationStatus deleteStatus = customerToTest.deleteResource(lastCustomer.getId(), params, lastCustomer);
//		    					
//				System.out.println("Deletion Status Code:" + deleteStatus.getStatus());
//				System.out.println("Deletion Status Message:" + deleteStatus.getStatusMessage());
//
//		    } catch (Exception ex) {
//		    	ex.printStackTrace();
//		    }

		    // Let's get the number of customers
		    //
		    try {
		    	Count customerCount = customerToTest.countResources(params);
		    					
				System.out.println("Total Number of Customers:" + customerCount.getCount());

		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }

		    // Search for specific customer
		    //
		    try {
		    	
		    	Parameter country = new Parameter("query", "country:Canada");
		    	params.add(country);

		    	Parameter fields = new Parameter("fields", "id,first_name,last_name");
		    	params.add(fields);
		    	
		    	List<Customer> customers = customerToTest.searchResources(params);
		    	
				assertTrue(customers != null);
				assertTrue(!customers.isEmpty());
				
				System.out.println("*** Number of Customers:" + customers.size());
		    					
		    } catch (Exception ex) {
		    	ex.printStackTrace();
		    }
		    
		} catch (ShopifyException e) {
			e.printStackTrace();
		}
	}

}
