package com.vm.client;

import com.vm.bean.Product;
import com.vm.service.ProductService;

public class Client {

	public static void main(String[] args) 
	{
		ProductService productservice= new ProductService();
		Product product=productservice.getByProductID(100);
		System.out.println("Product");
		System.out.println(product.getProductId()+" "+product.getProductName()+" "+product.getQuantity());
		
		System.out.println(productservice.getAllProducts());
		
	}

}

