package model;

import java.io.Serializable;

public class OrderProductModel {
	private static final long serialVersionUID = 1L;
	private int order_product_id;
	private int product_id;
	private int order_id;
	
	
	// constructor
	public OrderProductModel(int order_product_id, int product_id, int order_id) {
		super();
		this.order_product_id = order_product_id;
		this.product_id = product_id;
		this.order_id = order_id;
	}


	// getter and setter method
	public int getOrder_product_id() {
		return order_product_id;
	}


	public void setOrder_product_id(int order_product_id) {
		this.order_product_id = order_product_id;
	}


	public int getProduct_id() {
		return product_id;
	}

	
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public int getOrder_id() {
		return order_id;
	}


	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
