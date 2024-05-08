package model;

import java.io.Serializable;

public class ProductModel implements Serializable{
	private static final long serialVersionUID = 1L;
	private int product_id;
	private String product_name;
	private double product_price;
	private String product_desc;
	private String vendor;
	private int category_id;
	private String product_img;
	
	// database controller for admin page
	public ProductModel(int product_id, String product_name, double product_price, String vendor,
			int category_id) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_price = product_price;
		this.vendor = vendor;
		this.category_id = category_id;
		
	}
	
	
	// database controller for product page
	public ProductModel(String product_name,double product_prise, String product_desc, String product_img) {
		super();
		this.product_name = product_name;
		this.product_price = product_prise;
		this.product_desc = product_desc;
		this.product_img = product_img;
	}


	public int getProduct_id() {
		return product_id;
	}


	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}


	public String getProduct_name() {
		return product_name;
	}


	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}


	public double getProduct_price() {
		return product_price;
	}


	public void setProduct_price(double product_price) {
		this.product_price = product_price;
	}


	public String getProduct_desc() {
		return product_desc;
	}


	public void setProduct_desc(String product_desc) {
		this.product_desc = product_desc;
	}


	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public String getProduct_img() {
		return product_img;
	}


	public void setProduct_img(String product_img) {
		this.product_img = product_img;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	
	

}
