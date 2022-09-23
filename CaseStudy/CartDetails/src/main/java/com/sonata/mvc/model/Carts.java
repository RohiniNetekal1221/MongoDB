package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.context.properties.bind.Name;

@Entity
public class Carts {

	@Id
	private long prodId;
	private int prodQuantity;
	private String paymentMode;
	
	public Carts() {
		super();
	}
	public Carts(long prodId, int prodQuantity, String paymentMode) {
		super();
		this.prodId = prodId;
		this.prodQuantity = prodQuantity;
		this.paymentMode = paymentMode;
	}
	public long getProdId() {
		return prodId;
	}
	public void setProdId(long prodId) {
		this.prodId = prodId;
	}
	public int getProdQuantity() {
		return prodQuantity;
	}
	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	
}
