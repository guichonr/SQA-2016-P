package com.sqa2014.persistence.dao.impl;

import com.sqa2014.persistence.dao.ProductDao;
import com.sqa2014.persistence.entities.Brand;
import com.sqa2014.persistence.entities.Product;

import rest.lets.dao.impl.GenericDaoImpl;

public class ProductDaoImpl  extends GenericDaoImpl implements ProductDao{

	private static Class<?>[] annotatedClasses = {Product.class, Brand.class};		
	
	public ProductDaoImpl() {	
		super(Product.class, annotatedClasses, "hibernate.remote.cfg.xml");
	}
	
}
