package com.dev.sales.order.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.dev.sales.order.model.Customer;

@Component
public class CustomerService {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public void save(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	@Transactional
	public List<Customer> findAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery("FROM Customer").list();
	}
}
