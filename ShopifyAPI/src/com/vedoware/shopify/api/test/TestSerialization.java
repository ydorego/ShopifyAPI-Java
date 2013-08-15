package com.vedoware.shopify.api.test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.vedoware.shopify.api.Address;
import com.vedoware.shopify.api.customers.Customer;


public class TestSerialization {

	public static void main(String[] args) {

		Customer customer = new Customer();
		customer.setCreatedAt(new Date());
		Address address = new Address();
		address.setAddress1("65 Osprey");
		List<Address> addresses = new ArrayList<Address>();
		addresses.add(address);
		
		customer.setFirstName("Yves");
		customer.setAddresses(addresses);
		customer.setDefaultAddress(address);
		
	    ObjectMapper mapper = new ObjectMapper();
	    mapper.enable(SerializationFeature.INDENT_OUTPUT);
	    mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, true);
	    mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);
	    
	    try {
			System.out.println(mapper.writeValueAsString(customer));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
	}

}
