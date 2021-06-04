package com.vm.service;

import java.util.Map;

import com.vm.bean.Product;
import com.vm.dao.IProductDAO;
import com.vm.dao.ProductDAO;

public class ProductService implements IProductService {

	IProductDAO productDao=new ProductDAO();
	@Override
	public Product getByProductID(int id) 
	{
		
		return productDao.getProductByID(id);
	}
	@Override
	public Map<Integer, Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAllProducts();
	}

}