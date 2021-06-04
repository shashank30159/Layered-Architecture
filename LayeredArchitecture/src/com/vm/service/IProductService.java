package com.vm.service;

import java.util.Map;

import com.vm.bean.Product;

public interface IProductService {
	Product getByProductID(int id);
	Map<Integer,Product> getAllProducts();
}
