package com.dev.sales.order.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dev.sales.order.model.Order;
import com.dev.sales.order.model.Sales;

@Component
public class SalesService {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Sales sales) {
		Session session = sessionFactory.getCurrentSession();
		session.save(sales);
	}

	@Transactional
	public List<Order> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Sales").list();
	}

}
