package com.dev.sales.order.model;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = 1L;

	private String code;
	private String description;
	private Integer quantity;
	private double price;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
