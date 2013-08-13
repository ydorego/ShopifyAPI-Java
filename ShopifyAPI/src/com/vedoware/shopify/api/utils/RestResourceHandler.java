package com.vedoware.shopify.api.utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.vedoware.shopify.api.Count;
import com.vedoware.shopify.api.ShopifyResource;
import com.vedoware.shopify.api.devshop.DevShopAccessService;
import com.vedoware.shopify.api.types.OperationStatus;
import com.vedoware.shopify.api.types.Parameter;
import com.vedoware.shopify.exceptions.ShopifyException;

public class RestResourceHandler<T extends ShopifyResource> {

	private final DevShopAccessService devShopRef;
	private final ObjectMapper serializationObjectMapper;
	private final ObjectMapper deSerializationObjectMapper;
	private final Class<T> typeParameterClass;
    private final TypeFactory typeFactory;
    
	public RestResourceHandler(
					DevShopAccessService devShopRef,
					Class<T> typeParameterClass, 
					ObjectMapper serializationObjectMapper, 
					ObjectMapper deSerializationObjectMapper) {
		
		this.devShopRef = devShopRef;
		this.typeParameterClass = typeParameterClass;
		this.serializationObjectMapper = serializationObjectMapper;
		this.deSerializationObjectMapper = deSerializationObjectMapper;
	    this.typeFactory = TypeFactory.defaultInstance();

	}

	// ------------------------------------------------------------------------
	// CRUD related methods.
	// ------------------------------------------------------------------------
	
	// Create
	//
	public T createResource(String jsonWrappingTag, List<Parameter> parameters, T t) throws ShopifyException {
		
		try {

			// Serialize the given resource
			//
			System.out.println("Serialization of receive product");
			String resourcePayload = serializationObjectMapper.writeValueAsString(t);
			resourcePayload = "{" + "\"" + jsonWrappingTag + "\"" + ":" + resourcePayload + "}";
			System.out.println(resourcePayload);
			
			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);
			
			String jsonPayLoad = devShopRef.createShopResource(resourceData.getUrlSuffix(), parameters, resourcePayload);			
			System.out.println(jsonPayLoad);

			jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			System.out.println(jsonPayLoad);
			
			T jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructType(typeParameterClass));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}
	}
    
	// Retrieve single resource
	//
	public T retrieveResource(List<Parameter> parameters) throws ShopifyException  { 
		return this.retrieveResource(null, parameters);
	}
	
	public T retrieveResource(Integer id, List<Parameter> parameters) throws ShopifyException  { 		
				
		try {
			
			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);

			String targetResource = resourceData.getUrlSuffix();
			
			if (id != null) {
				targetResource = targetResource + "/" + id.intValue();
			}
			
			String jsonPayLoad = devShopRef.getShopResource(targetResource, parameters);			
			System.out.println(jsonPayLoad);

			jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			System.out.println(jsonPayLoad);
			
			T jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructType(typeParameterClass));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}		
	}
	
	// Retrieve multiple resources
	//
	public List<T> retrieveResources(List<Parameter> parameters) throws ShopifyException  { 		
		
		try {
			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);
			
			String jsonPayLoad = devShopRef.getShopResource(resourceData.getUrlSuffix(), parameters);			
			System.out.println(jsonPayLoad);

			jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			System.out.println(jsonPayLoad);
			
			List<T> jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructCollectionType(ArrayList.class, typeParameterClass));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}		
	}

	
	// Retrieve multiple resources
	//
	public List<T> searchResources(List<Parameter> parameters) throws ShopifyException  { 		
		
		try {
			
			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);
			String targetResource = resourceData.getUrlSuffix() + "/search";
			
			String jsonPayLoad = devShopRef.searchShopResource(targetResource, parameters);			
			System.out.println(jsonPayLoad);

			jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			System.out.println(jsonPayLoad);
			
			List<T> jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructCollectionType(ArrayList.class, typeParameterClass));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}		
	}

	
	// Update single resource
	//
	public T updateResource(String jsonWrappingTag, Integer id, List<Parameter> parameters, T t) throws ShopifyException  { 		

		try {

			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);
			String targetResource = resourceData.getUrlSuffix();
										
			if (id != null) {
				targetResource = targetResource + "/" + id.intValue();
			}
					
			// Serialize the given resource
			//
			System.out.println("Serialization of receive product");
			String resourcePayload = serializationObjectMapper.writeValueAsString(t);
			resourcePayload = "{" + "\"" + jsonWrappingTag + "\"" + ":" + resourcePayload + "}";
			System.out.println(resourcePayload);
			
			String jsonPayLoad = devShopRef.updateShopResource(targetResource, parameters, resourcePayload);			
			System.out.println(jsonPayLoad);

			jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			System.out.println(jsonPayLoad);
			
			T jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructType(typeParameterClass));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}
	}
	
	// Delete single resource
	//
	public OperationStatus deleteResource(Integer id, List<Parameter> parameters, T t) throws ShopifyException { 
		
		try {
			
			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);

			String targetResource = resourceData.getUrlSuffix();

			if (id != null) {
				targetResource = targetResource + "/" + id.intValue();
			}
						
			OperationStatus jsonPayLoad = devShopRef.deleteShopResource(targetResource, parameters);			
			
			return jsonPayLoad; 
			
		} catch (Exception e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}
	}
	
	public Count countResources(List<Parameter> parameters) throws ShopifyException  { 		
				
		try {

			ResourceData resourceData = Utils.getInstance().getResourceUrlSuffix(typeParameterClass);

			String jsonPayLoad = devShopRef.getShopResource(resourceData.getUrlSuffix() + "/count", parameters);			
			System.out.println(jsonPayLoad);

			//jsonPayLoad = jsonPayLoad.substring(jsonPayLoad.indexOf(":")+1);
			//System.out.println(jsonPayLoad);
			
			Count jsonObject = deSerializationObjectMapper.readValue(jsonPayLoad, typeFactory.constructType(Count.class));
			System.out.println(jsonObject.toString());
			System.out.println();
			System.out.println();
			
			return jsonObject; 
			
		} catch (JsonParseException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (JsonMappingException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		} catch (IOException e) {
			throw new ShopifyException("Retrieve Resources Issues", e);
		}		
	}
	
}
