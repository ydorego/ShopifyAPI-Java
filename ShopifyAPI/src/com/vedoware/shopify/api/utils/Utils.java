package com.vedoware.shopify.api.utils;

import java.util.HashMap;
import java.util.Map;

import com.vedoware.shopify.api.ApplicationCharge;
import com.vedoware.shopify.api.Asset;
import com.vedoware.shopify.api.CarrierService;
import com.vedoware.shopify.api.Checkout;
import com.vedoware.shopify.api.Country;
import com.vedoware.shopify.api.Event;
import com.vedoware.shopify.api.MetaField;
import com.vedoware.shopify.api.Page;
import com.vedoware.shopify.api.Province;
import com.vedoware.shopify.api.RecurringApplicationCharge;
import com.vedoware.shopify.api.Redirect;
import com.vedoware.shopify.api.ScriptTag;
import com.vedoware.shopify.api.ShopifyResource;
import com.vedoware.shopify.api.SmartCollection;
import com.vedoware.shopify.api.Theme;
import com.vedoware.shopify.api.Transactions;
import com.vedoware.shopify.api.WebHook;
import com.vedoware.shopify.api.blog.Article;
import com.vedoware.shopify.api.blog.Blog;
import com.vedoware.shopify.api.blog.Comment;
import com.vedoware.shopify.api.customers.Customer;
import com.vedoware.shopify.api.customers.CustomerGroup;
import com.vedoware.shopify.api.customers.Shop;
import com.vedoware.shopify.api.fulfillment.Fulfillment;
import com.vedoware.shopify.api.fulfillment.FulfillmentService;
import com.vedoware.shopify.api.fulfillment.Receipt;
import com.vedoware.shopify.api.order.Order;
import com.vedoware.shopify.api.order.OrderRisks;
import com.vedoware.shopify.api.products.Collect;
import com.vedoware.shopify.api.products.CustomCollection;
import com.vedoware.shopify.api.products.Product;
import com.vedoware.shopify.api.products.ProductImage;
import com.vedoware.shopify.api.products.ProductSearchEngine;
import com.vedoware.shopify.api.products.ProductVariant;
import com.vedoware.shopify.exceptions.ShopifyException;

public class Utils {

	private Map<Class<? extends ShopifyResource>, ResourceData> mapToResourceData;
	
	private static Utils _instance;
	
	private Utils() {
		initResourcesData();
	}
		
	public static Utils getInstance() {
		
		if (_instance == null) {
			_instance = new Utils();
		}
		
		return _instance;
	}
	
	public ResourceData getResourceUrlSuffix(Class<? extends ShopifyResource> clazz) throws ShopifyException {
	
		if (mapToResourceData.containsKey(clazz)) {
			return mapToResourceData.get(clazz);
		}
		
		throw new ShopifyException("Resource Data not found for class " + clazz);
	}
	
	
	private void initResourcesData() {
		
		if (mapToResourceData == null) {
			mapToResourceData = new HashMap<Class<? extends ShopifyResource>, ResourceData>();
		}
		

		mapToResourceData.put(Theme.class, 						new ResourceData(Theme.class, "themes"));
		mapToResourceData.put(Asset.class, 						new ResourceData(Asset.class, "themes/{id}/assets"));

		mapToResourceData.put(Blog.class, 						new ResourceData(Blog.class, "blogs"));
		mapToResourceData.put(Article.class, 					new ResourceData(Article.class, "blogs/{id}/articles"));
		mapToResourceData.put(Comment.class, 					new ResourceData(Comment.class, "comments"));

		mapToResourceData.put(CarrierService.class, 			new ResourceData(CarrierService.class, "carrier_services"));
		mapToResourceData.put(Checkout.class, 					new ResourceData(Checkout.class, "checkouts"));
		mapToResourceData.put(Country.class, 					new ResourceData(Country.class, "countries"));
		mapToResourceData.put(Collect.class, 					new ResourceData(Collect.class, "collects"));
		mapToResourceData.put(Event.class, 						new ResourceData(Event.class, "events"));
		mapToResourceData.put(MetaField.class, 					new ResourceData(MetaField.class, "metafields"));
		mapToResourceData.put(Page.class, 						new ResourceData(Page.class, "pages"));
		mapToResourceData.put(Province.class, 					new ResourceData(Province.class, "provinces"));

		mapToResourceData.put(ApplicationCharge.class, 			new ResourceData(ApplicationCharge.class, "application_charges"));
		mapToResourceData.put(RecurringApplicationCharge.class,	new ResourceData(RecurringApplicationCharge.class, "recurring_application_charges"));
		mapToResourceData.put(Redirect.class, 					new ResourceData(Redirect.class, "redirects"));
		mapToResourceData.put(ScriptTag.class, 					new ResourceData(ScriptTag.class, "script_tags"));
		mapToResourceData.put(SmartCollection.class, 			new ResourceData(SmartCollection.class, "smart_collections"));
		mapToResourceData.put(Transactions.class, 				new ResourceData(Transactions.class, "transactions"));
		mapToResourceData.put(WebHook.class, 					new ResourceData(WebHook.class, "webhooks"));

		mapToResourceData.put(CustomCollection.class, 			new ResourceData(CustomCollection.class, "custom_collections"));
		mapToResourceData.put(Customer.class, 					new ResourceData(Customer.class, "customers"));
		mapToResourceData.put(CustomerGroup.class, 				new ResourceData(CustomerGroup.class, "customer_groups"));
		
		// Exception to the rule, single shop...
		//
		mapToResourceData.put(Shop.class, 						new ResourceData(Shop.class, "shop"));
		
		mapToResourceData.put(Fulfillment.class, 				new ResourceData(Fulfillment.class, "orders/{id}/fulfillments"));
		mapToResourceData.put(FulfillmentService.class, 		new ResourceData(FulfillmentService.class, "fulfillment_services"));
		mapToResourceData.put(Receipt.class, 					new ResourceData(Receipt.class, "receipts"));
		mapToResourceData.put(Order.class, 						new ResourceData(Order.class, "orders"));
		mapToResourceData.put(OrderRisks.class, 				new ResourceData(OrderRisks.class, "orders/{i}/risks"));

		mapToResourceData.put(Product.class, 					new ResourceData(Product.class, "products"));
		mapToResourceData.put(ProductImage.class, 				new ResourceData(ProductImage.class, "products/{id}/images"));
		mapToResourceData.put(ProductVariant.class, 			new ResourceData(ProductVariant.class, "products/{id}/variants"));
		mapToResourceData.put(ProductSearchEngine.class, 		new ResourceData(ProductSearchEngine.class, "product_search_engines"));
		
	}
	
	
}
