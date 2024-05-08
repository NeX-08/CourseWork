package model;

import java.io.Serializable;

public class OrderModel implements Serializable {
	private static final long serialVersionUID = 1L;
	private int order_id;
	private int user_id;
	private double total_amount;
	private String delivery_address;
	private String order_date;
	private String delivery_status;
	
	// constructor
	public OrderModel(int order_id, int user_id, double total_amount, String delivery_address, String order_date,
			String delivery_status) {
		super();
		this.order_id = order_id;
		this.user_id = user_id;
		this.total_amount = total_amount;
		this.delivery_address = delivery_address;
		this.order_date = order_date;
		this.delivery_status = delivery_status;
	}

	
	public OrderModel(int order_id, int user_id, String order_date, String delivery_status) {
		this.order_id = order_id;
		this.user_id = user_id;
		this.order_date = order_date;
		this.delivery_status = delivery_status;
	}


	// getter method and setter method
	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public double getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}

	public String getDelivery_address() {
		return delivery_address;
	}

	public void setDelivery_address(String delivery_address) {
		this.delivery_address = delivery_address;
	}

	public String getOrder_date() {
		return order_date;
	}

	public void setOrder_date(String order_date) {
		this.order_date = order_date;
	}

	public String getDelivery_status() {
		return delivery_status;
	}

	public void setDelivery_status(String delivery_status) {
		this.delivery_status = delivery_status;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
}
