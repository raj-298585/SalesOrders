package com.dev.sales.order.model;

import java.io.Serializable;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer customerNum;
	private String code;
	private String name;
	private String address;
	private String phone1;
	private String phone2;
	private double creditLimit;
	private double currentCredit;

	public Integer getCustomerNum() {
		return customerNum;
	}

	public void setCustomerNum(Integer customerNum) {
		this.customerNum = customerNum;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}

	public double getCurrentCredit() {
		return currentCredit;
	}

	public void setCurrentCredit(double currentCredit) {
		this.currentCredit = currentCredit;
	}

}
