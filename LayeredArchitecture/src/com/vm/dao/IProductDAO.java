package com.vm.dao;

import java.util.Map;

import com.vm.bean.Product;

public interface IProductDAO 
{
	Product getProductByID(int id);
	Map<Integer,Product> getAllProducts();
}
