package com.dev.sales.order.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dev.sales.order.model.Product;

@Component
public class ProductService {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Product product) throws Exception {
		Session session = sessionFactory.getCurrentSession();
		session.save(product);
	}

	@Transactional
	public List<Product> findAll() throws Exception {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Product").list();
	}
}
