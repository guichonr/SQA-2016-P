package com.sqa2014.persistence;

import java.util.List;

import com.sqa2014.persistence.dao.BrandDao;
import com.sqa2014.persistence.dao.ProductDao;
import com.sqa2014.persistence.dao.impl.BrandDaoImpl;
import com.sqa2014.persistence.dao.impl.ProductDaoImpl;
import com.sqa2014.persistence.entities.Brand;
import com.sqa2014.persistence.entities.Product;

public class Main {

	public static void main(String[] args) {
		
		//Create a new product
		ProductDao product = new ProductDaoImpl();
		Product p = new Product();
		p.setName("Prueba");
		product.create(p);
		
		
		//Get a list of products
		List<Product> pl = (List<Product>) product.getList();
		
		
		BrandDao brand = new BrandDaoImpl();
		Brand b = new Brand();
		b.setName("Adidas");
		
		brand.create(b);
		
	
		
		System.out.println();
	}
}
