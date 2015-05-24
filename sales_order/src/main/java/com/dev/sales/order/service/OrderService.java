package com.dev.sales.order.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dev.sales.order.model.Order;

@Component
public class OrderService {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Order order) {
		Session session = sessionFactory.getCurrentSession();
		session.save(order);
	}

	@Transactional
	public List<Order> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Order").list();
	}
}
